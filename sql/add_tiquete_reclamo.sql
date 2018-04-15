CREATE DEFINER=`root`@`localhost` PROCEDURE `add_tiquete_reclamo`(IN id_curso INT, IN nombre varchar(45), IN correo varchar(45), IN carnet varchar(45), IN fecha_hora DateTime, IN motivo varchar(45), IN archivo blob, IN fk_tipoevaluacion INT)
BEGIN
	insert into tiquete (Nombre, Correo, Carnet, Fecha_Hora, Fk_Curso)
    values (nombre, correo, carnet, fecha_hora, id_curso);
    
    set @last_ticket = (SELECT MAX(Id) FROM tiquete);
    
    insert into reclamo (Motivo, Archivo, Fk_Tiquete, Fk_TipoEvaluacion)
    values(motivo, archivo, @last_ticket, fk_tipoevaluacion);
END