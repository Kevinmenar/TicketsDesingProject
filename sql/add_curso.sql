CREATE DEFINER=`root`@`localhost` PROCEDURE `add_curso`(IN nombre varchar(45), IN codigo varchar(45), IN creditos varchar(45), IN fk_profesor INT)
BEGIN
	insert into curso (Nombre, Codigo, Creditos, Fk_Profesor)
    values (nombre, codigo, creditos, fk_profesor);
END