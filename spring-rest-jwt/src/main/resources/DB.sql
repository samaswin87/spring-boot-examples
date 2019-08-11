CREATE DATABASE testing;
CREATE TABLE users(id INT NOT NULL AUTO_INCREMENT,age INT,firstName VARCHAR(255),lastName VARCHAR(255),password VARCHAR(255), userName VARCHAR(255),PRIMARY KEY (id))ENGINE=MyISAM;

INSERT INTO users (id, firstname, lastname, userName, password, age) VALUES (1, 'Aswin','Raj', 'aswin123','$2y$12$Rg1HBmCtYjSKNB.W7a4xleecEwKiojMq7RdWIYWEjrIqy1trMgzRu', 33);
INSERT INTO users (id, firstname, lastname, userName, password, age)  VALUES (2, 'Kumar', 'Kasi', 'kasi123', '$2y$12$667UeRP/p6aYkyfoUMlueOdDgpDgUvE351y9ucvHEcglm/HOq49X2', 23);
INSERT INTO users (id, firstname, lastname, userName, password, age)  VALUES (3, 'Navin', 'Raj', 'raj123', '$2y$12$l/ewGF9TVJBueBVBGdgEGeFQfKenVTlzCzyCO3tCZiS7cSPwrRqOq', 45);