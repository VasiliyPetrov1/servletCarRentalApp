DROP DATABASE IF EXISTS car_rental_servlet_app_db;
CREATE DATABASE car_rental_servlet_app_db;

USE car_rental_servlet_app_db;

CREATE TABLE account(
	id INT NOT NULL AUTO_INCREMENT,
    username VARCHAR(45) NOT NULL, 
    email VARCHAR(45),
    password VARCHAR(45) NOT NULL,
    active BOOLEAN NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE role(
	id INT NOT NULL AUTO_INCREMENT,
    account_id INT NOT NULL,
    roles ENUM('NONE', 'USER', 'ADMIN', 'MANAGER') NOT NULL,
    PRIMARY KEY(id),
	CONSTRAINT account_id
    FOREIGN KEY (account_id) REFERENCES account(id) ON DELETE CASCADE ON UPDATE CASCADE
);




