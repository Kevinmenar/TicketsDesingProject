package desingprojectticket;

import controller.DAO.DAOTiqueteImp;
import model.Curso;

public class DesingProjectTicket {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setId(3);
        DAOTiqueteImp tiqueteConection = new DAOTiqueteImp();
        tiqueteConection.getTiqueteConsultaNombre(curso);
    }  
}
