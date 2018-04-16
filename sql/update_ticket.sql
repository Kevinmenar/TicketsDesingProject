CREATE DEFINER=`root`@`localhost` PROCEDURE `update_ticket`(IN Ticket INT)
BEGIN
	update tiquete t
    set t.Estado = 'Cerrado'
    where t.Id = Ticket;
END