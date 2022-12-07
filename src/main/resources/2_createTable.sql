DROP TABLE users;
CREATE TABLE users
(
    id int(11) NOT NULL AUTO_INCREMENT,
    email varchar(255) UNIQUE DEFAULT NULL,
    username varchar(255) DEFAULT NULL,
    password varchar(255) DEFAULT NULL,
    PRIMARY KEY (id)
) ;

