CREATE DEFINER=`root`@`localhost` PROCEDURE `add_tiquetehabilitados`(IN tiquete varchar(45), IN fk_curso INT)
BEGIN
	insert into tiquetehabilitados (Tiquete, Fk_Curso)
    values (tiquete, fk_curso);
END