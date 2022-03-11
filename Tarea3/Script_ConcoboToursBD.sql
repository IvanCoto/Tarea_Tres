CREATE SCHEMA `concobotours`;
CREATE TABLE `concobotours`.`usuario`(`id_usuario` INT NOT NULL auto_increment, `correo` VARCHAR(50) NULL,`nombre` VARCHAR(50) NOT NULL, `apellidos` VARCHAR(50) NOT NULL, 
`telefono` VARCHAR(50) NULL, `contrasena` VARCHAR(50) NULL, PRIMARY KEY (`id_usuario`));

CREATE TABLE `concobotours`.`contacto`(`id_contacto` INT NOT NULL auto_increment, `nombre` varchar(50) NOT NULL, `apellidos` varchar(50) NOT NULL,
 `tour` VARCHAR(50) NULL, `telefono` VARCHAR(50) NULL, PRIMARY KEY(`id_contacto`));
 
CREATE USER 'admin_sistema' @'%' IDENTIFIED BY 'adminconcobo';
GRANT ALL PRIVILEGES ON concobotours to 'admin_sistema';
flush privileges;