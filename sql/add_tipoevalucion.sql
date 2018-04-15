CREATE DEFINER=`root`@`localhost` PROCEDURE `add_tipoevaluacion`(IN tipo varchar(45))
BEGIN
	insert into tipoevaluacion(Tipo)
    values(tipo);
END