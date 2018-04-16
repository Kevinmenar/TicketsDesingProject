CREATE DEFINER=`root`@`localhost` PROCEDURE `add_tiquete_consulta`(IN id_curso INT, IN nombre varchar(45), IN correo varchar(45), IN carnet varchar(45), IN fecha_hora DateTime, IN lugar varchar(45), IN duracion varchar(45))
BEGIN
	insert into tiquete (Nombre, Correo, Carnet, Fecha_Hora, Fk_Curso, Estado)
    values (nombre, correo, carnet, fecha_hora, id_curso, 'Abierto');
    
    set @last_ticket = (SELECT MAX(Id) FROM tiquete);
    
    insert into consulta (Lugar, Duracion, Fk_Tiquete)
    values(lugar, duracion, @last_ticket);
END