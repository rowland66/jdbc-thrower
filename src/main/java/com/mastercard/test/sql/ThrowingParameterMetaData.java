package com.mastercard.test.sql;

import java.sql.ParameterMetaData;

/**
 * A {@link ParameterMetaData} decorated to throw an SQLException on command.
 */
public class ThrowingParameterMetaData 
    extends ThrowingParameterMetaDataVariant  
    implements ParameterMetaData {
  
  /**
   * Constructor.
   * @param parameterMetaData the ParameterMetaData to decorate
   */
  public ThrowingParameterMetaData(ParameterMetaData parameterMetaData) {
    this.it = parameterMetaData;
  }

}
