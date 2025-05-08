CREATE TYPE cuisine_type AS ENUM ('Italian', 'French', 'Chinese', 'American');

CREATE TABLE IF NOT EXISTS Restaurant (
    id VARCHAR(36) PRIMARY KEY,
    name VARCHAR(70),
    address_street VARCHAR(70),
    address_city VARCHAR(40),
    address_state VARCHAR(2),
    address_postalcode VARCHAR(5),
    cuisine cuisine_type,
    description TEXT);

INSERT INTO Restaurant (id, name, address_street, address_city, address_state, address_postalcode, cuisine, description) VALUES ('1','Chung Pow','10 Schoolhouse Ln','Morristown','NJ','07960','Chinese','Good food');