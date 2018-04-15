CREATE DEFINER=`root`@`localhost` PROCEDURE `add_profesor`(IN nombre varchar(45), IN contrasena varchar(45), IN email varchar(45))
BEGIN
	insert into profesor(Nombre, Contrasena, Email)
    values (nombre, contrasena, email);
END