CREATE DEFINER=`root`@`localhost` PROCEDURE `get_tickets_consulta_curso_fecha`(IN curso INT)
BEGIN
	select t.Nombre, t.Correo, t.Carnet, t.Fecha, t.Estado, c.Lugar, c.Duracion from tiquete t, consulta c
    where t.Fk_Curso = curso and t.Id = c.Fk_tiquete
    order by t.Fecha;
END