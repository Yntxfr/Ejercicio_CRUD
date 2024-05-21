CREATE DATABASE ejercicioCRUD;
USE ejercicioCRUD;

CREATE TABLE Usuario (
id INT AUTO_INCREMENT PRIMARY KEY,
username VARCHAR(50) NOT NULL,
password VARCHAR(50) NOT NULL,
email VARCHAR(100) NOT NULL);

INSERT INTO USUARIO(username, password, email) VALUES('user1', 'password1', 'user1@email.com');

select * from Usuario;

commit;