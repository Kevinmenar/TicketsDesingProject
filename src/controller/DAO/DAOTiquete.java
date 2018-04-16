package controller.DAO;

import java.util.ArrayList;
import model.Tiquete;

public interface  DAOTiquete {
    public ArrayList<Tiquete> getTiqueteConsulta();
    public ArrayList<Tiquete> getTiqueteConsultaNombre();
    public ArrayList<Tiquete> getTiqueteConsultaFecha();
    public ArrayList<Tiquete> getTiqueteReclamo();
    public ArrayList<Tiquete> getTiqueteReclamoNombre();
    public ArrayList<Tiquete> getTiqueteReclamoFecha();
    public ArrayList<Tiquete> getTiqueteRevision();
    public ArrayList<Tiquete> getTiqueteRevisionNombre();
    public ArrayList<Tiquete> getTiqueteRevisionFecha();
    public void addTiqueteConsulta(Tiquete tiquete);
    public void addTiqueteRevision(Tiquete tiquete);
    public void addTiqueteReclamo(Tiquete tiquete);
    public void updateTiquete(int id);
}
