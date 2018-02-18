CREATE TABLE administrator(id INT AUTO_INCREMENT NOT NULL PRIMARY KEY, nameAdministrator VARCHAR(50) NOT NULL,firstSurname VARCHAR(50) NOT NULL, secondSurname VARCHAR(50),
 phoneNumber INT NOT NULL, email VARCHAR(50) NOT NULL, passwordAdministrator VARCHAR(50) NOT NULL, isAdmi boolean NOT NULL);



CREATE TABLE functionary(id INT AUTO_INCREMENT NOT NULL PRIMARY KEY, nameFunctionary VARCHAR(50) NOT NULL,firstSurname VARCHAR(50) NOT NULL, secondSurname VARCHAR(50), phoneNumber INT NOT NULL, email VARCHAR(40) NOT NULL,occupation VARCHAR (50) NOT NULL, passwordFunctionary VARCHAR(50) NOT NULL, isAdmi boolean NOT NULL);



CREATE TABLE student(id INT AUTO_INCREMENT NOT NULL PRIMARY KEY, nameStudent VARCHAR(50) NOT NULL,firstSurname VARCHAR(50) NOT NULL, secondSurname VARCHAR(50), phoneNumber INT NOT NULL, email VARCHAR(40) NOT NULL, career VARCHAR(30) NOT NULL, passwordStudent VARCHAR(50) NOT NULL, isAdmi boolean NOT NULL);
