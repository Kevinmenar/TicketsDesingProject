CREATE DEFINER=`root`@`localhost` PROCEDURE `get_tiquetes_reclamo_curso`(IN curso INT)
BEGIN
	select t.Nombre, t.Correo, t.Carnet, t.Fecha, t.Estado, r.Archivo, r.Motivo, te.Tipo from tiquete t, reclamo r, tipoevaluacion te
    where t.Fk_Curso = curso and t.Id = r.Fk_Tiquete and te.Id = r.Fk_TipoEvaluacion;
END