CREATE DEFINER=`root`@`localhost` PROCEDURE `get_tickets_curso`()
BEGIN
	select p.Nombre, c.Nombre, th.Tiquete  from profesor p, curso c, tiquetehabilitados th
    where p.id = c.Fk_Profesor and c.Id = th.Fk_Curso;
END