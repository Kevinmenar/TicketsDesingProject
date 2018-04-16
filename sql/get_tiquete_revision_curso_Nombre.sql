CREATE DEFINER=`root`@`localhost` PROCEDURE `get_tiquete_revision_curso_Nombre`(IN curso INT)
BEGIN
	select t.Nombre, t.Correo, t.Carnet, t.Fecha, t.Estado, r.Archivo, r.Descripcion, te.Tipo from tiquete t, revision r, tipoevaluacion te
    where t.Fk_Curso = curso and t.Id = r.Fk_Tiquete and te.Id = r.Fk_TipoEvaluacion
    order by t.Nombre;
END