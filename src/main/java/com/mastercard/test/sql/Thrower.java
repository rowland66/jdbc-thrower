package com.mastercard.test.sql;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * A class which can throw on demand.
 */
public abstract class Thrower {
  private static final Pattern FIND_SPACES_PATTERN = Pattern.compile("\\s+");

  @AllArgsConstructor
  private static class ThrowParams {
    private final Object[] params;
    private int toGo;
    private final Class<? extends SQLException> toThrow;

    private void decrementToGo() {
      if (toGo > 0) {
        toGo--;
      }
    }
  }

  static Hashtable<String, List<ThrowParams>> throwers = new Hashtable<>();

  protected Thrower() {}
  
  /**
   * Tell named method to start throwing exceptions.
   * @param i Interface class object
   * @param methodName name in class.methodName format
   */
  public static void startThrowing(Class<?> i, String methodName) {
    startThrowing(i, methodName, null);
  }

  public static void startThrowing(Class<?> i, String methodName, Object[] params) {
    startThrowing(i, methodName, params, SQLException.class);
  }

  public static void startThrowing(Class<?> i, String methodName, Object[] params, Class<? extends SQLException> toThrow) {
    String fullName = i.getName() + "." + methodName;
    if (!throwers.containsKey(fullName)) {
      throwers.put(fullName, new LinkedList<>());
    }
    List<ThrowParams> value = throwers.get(fullName);
    value.add(new ThrowParams(params, 1, toThrow));
  }

  public static void startThrowingAfter(Class<?> i, String methodName, int goes) {
    startThrowingAfter(i, methodName, goes, null);
  }

  public static void startThrowingAfter(Class<?> i, String methodName, int goes, Object[] params) {
    startThrowingAfter(i, methodName, goes, null, SQLException.class);
  }

  /**
   * Tell named method to start throwing exceptions after
   * being called a number of times.
   * @param i Interface class object
   * @param methodName name in class.methodName format
   * @param goes number of time method can be called before throwing
   */
  public static void startThrowingAfter(Class<?> i, String methodName, int goes, Object[] params, Class<? extends SQLException> toThrow) {
    String fullName = i.getName() + "." + methodName;
    if (!throwers.containsKey(fullName)) {
      throwers.put(fullName, new LinkedList<>());
    }
    List<ThrowParams> value = throwers.get(fullName);
    value.add(new ThrowParams(params, 1+goes, toThrow));
  }

  /**
   * Tell named method to stop throwing exceptions.
   * @param i Interface class object
   * @param methodName name in class.methodName format
   */
  public static void stopThrowing(Class<?> i, String methodName) {
    String fullName = i.getName() + "." + methodName;
    throwers.put(fullName, Collections.singletonList(new ThrowParams(null, 0, null)));
  }

  public static void shouldThrow(Class<?> i, String methodName) throws SQLException{
    shouldThrow(i, methodName, null);
  }

  /**
   * Check whether method should throw, called once for every method invocation.
   * @param i Interface class object
   * @param methodName name in class.methodName format
   * @return whether method named should throw exception
   */
  public static void shouldThrow(Class<?> i, String methodName, Object[] parameters) throws SQLException{
    String fullName = i.getName() + "." + methodName;
    if (!throwers.containsKey(fullName)) {
      return;
    }
    List<ThrowParams> throwParamsList = throwers.get(fullName);
    List<ThrowParams> filteredThrowParamsList = throwParamsList.stream()
        .filter(pt -> parameterMatch(pt.params, parameters))
        .filter(pt -> pt.toGo > 0)
        .collect(Collectors.toList());

    if (filteredThrowParamsList.isEmpty()) {
      return;
    }

    filteredThrowParamsList.forEach(ThrowParams::decrementToGo);

    Optional<? extends Class<? extends SQLException>> maybeToThrow = filteredThrowParamsList.stream()
        .filter(pt -> pt.toGo == 0)
        .map(pt -> pt.toThrow)
        .findAny();

    if (maybeToThrow.isPresent()) {
      throwSqlException(maybeToThrow.get(), i.getName() + "." + methodName + "() bombed");
    }
  }

  private static boolean parameterMatch(Object[] criteriaParams, Object[] candidateParams) {
    if (criteriaParams == null) {
      return true;
    }
    if (criteriaParams != null && candidateParams == null) {
      return false;
    }
    if (criteriaParams.length < candidateParams.length) {
      return false;
    }
    for (int i=0; i<candidateParams.length; i++) {
      if (candidateParams[i] instanceof CharSequence && criteriaParams[i] instanceof Pattern) {
        String cleanCandidate = FIND_SPACES_PATTERN
            .matcher((CharSequence) candidateParams[i])
            .replaceAll(" ")
            .toLowerCase();
        Matcher matcher = ((Pattern) criteriaParams[i]).matcher(cleanCandidate);
        if (!matcher.matches()) {
          return false;
        }
      } else if (criteriaParams[i] instanceof String && !(candidateParams[i] instanceof String)) {
          if (!criteriaParams[i].equals(candidateParams[i].toString())) {
            return false;
          }
      } else if (criteriaParams[i].getClass() != candidateParams[i].getClass()) {
        return false;
      } else if (!criteriaParams[1].equals(candidateParams[i])) {
        return false;
      }
    }
    return true;
  }

  public static void throwSqlException(Class<? extends SQLException> clazz, String message) throws SQLException {
    try {
      SQLException e = clazz.getConstructor(String.class).newInstance(message);
      throw e;
    } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
      throw new RuntimeException(ex);
    }
  }
}
