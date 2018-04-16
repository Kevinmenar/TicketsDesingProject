package controller.DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Consulta;
import model.Curso;
import model.Estudiante;
import model.Revision;
import model.Tiquete;

public class DAOTiqueteImp {
    
    private String url;       
    private String user;      
    private String password;  

    public DAOTiqueteImp() {
        this.url = "jdbc:mysql://localhost:3306/tickets_database?autoReconnect=true&useSSL=false";
        this.user = "root";
        this.password = "kemar1993";
    }
    
    public ArrayList<Tiquete> getTiqueteConsulta(Curso curso) {
        Connection conn = null;
        ArrayList<Tiquete> tiquetesConsulta = new ArrayList<Tiquete>();
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            
            String query = "{ call get_tickets_consulta_curso(?) }";
            ResultSet rs;
            
            CallableStatement stmt = conn.prepareCall(query);
            
            stmt.setInt(1, curso.getId());
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                System.out.println("Ciclo While");
                Consulta consulta = new Consulta();
                Estudiante estudiante = new Estudiante();
                consulta.setId(rs.getInt("Id"));
                consulta.setFecha(rs.getDate("Fecha_Hora"));
                consulta.setHora(rs.getTime("Fecha_Hora"));
                consulta.setDuracion(rs.getString("Duracion"));
                consulta.setEstado(rs.getString("Estado"));
                consulta.setLugar(rs.getString("Lugar"));
                estudiante.setNombre(rs.getString("Nombre"));
                estudiante.setCarnet(rs.getString("Carnet"));
                estudiante.setCorreo(rs.getString("Correo"));
                System.out.println(estudiante.toString());
                System.out.println(consulta.toString());
                consulta.setEstudiante(estudiante);
                tiquetesConsulta.add(consulta);
            }
            
        } catch(SQLException e) {
           System.out.println(e.getMessage());
        } finally {
         try{
                   if(conn != null)
                     conn.close();
         }catch(SQLException ex){
                   System.out.println(ex.getMessage());
         }
       }
        return tiquetesConsulta;
    }
    
    public ArrayList<Tiquete> getTiqueteConsultaNombre(Curso curso) {
        Connection conn = null;
        ArrayList<Tiquete> tiquetesConsulta = new ArrayList<Tiquete>();
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            
            String query = "{ call get_tickets_consulta_curso_Nombre(?) }";
            ResultSet rs;
            
            CallableStatement stmt = conn.prepareCall(query);
            
            stmt.setInt(1, curso.getId());
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Consulta consulta = new Consulta();
                Estudiante estudiante = new Estudiante();
                consulta.setId(rs.getInt("Id"));
                consulta.setFecha(rs.getDate("Fecha_Hora"));
                consulta.setHora(rs.getTime("Fecha_Hora"));
                consulta.setDuracion(rs.getString("Duracion"));
                consulta.setEstado(rs.getString("Estado"));
                consulta.setLugar(rs.getString("Lugar"));
                estudiante.setNombre(rs.getString("Nombre"));
                estudiante.setCarnet(rs.getString("Carnet"));
                estudiante.setCorreo(rs.getString("Correo"));
                System.out.println(estudiante.toString());
                System.out.println(consulta.toString());
                consulta.setEstudiante(estudiante);
                tiquetesConsulta.add(consulta);
            }
            
        } catch(SQLException e) {
           System.out.println(e.getMessage());
        } finally {
         try{
                   if(conn != null)
                     conn.close();
         }catch(SQLException ex){
                   System.out.println(ex.getMessage());
         }
       }
        return tiquetesConsulta;
    }
    
    public ArrayList<Tiquete> getTiqueteConsultaFecha(Curso curso) {
        Connection conn = null;
        ArrayList<Tiquete> tiquetesConsulta = new ArrayList<Tiquete>();
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            
            String query = "{ call get_tickets_consulta_curso_fecha(?) }";
            ResultSet rs;
            
            CallableStatement stmt = conn.prepareCall(query);
            
            stmt.setInt(1, curso.getId());
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                System.out.println("Ciclo While");
                Consulta consulta = new Consulta();
                Estudiante estudiante = new Estudiante();
                consulta.setId(rs.getInt("Id"));
                consulta.setFecha(rs.getDate("Fecha_Hora"));
                consulta.setHora(rs.getTime("Fecha_Hora"));
                consulta.setDuracion(rs.getString("Duracion"));
                consulta.setEstado(rs.getString("Estado"));
                consulta.setLugar(rs.getString("Lugar"));
                estudiante.setNombre(rs.getString("Nombre"));
                estudiante.setCarnet(rs.getString("Carnet"));
                estudiante.setCorreo(rs.getString("Correo"));
                System.out.println(estudiante.toString());
                System.out.println(consulta.toString());
                consulta.setEstudiante(estudiante);
                tiquetesConsulta.add(consulta);
            }
            
        } catch(SQLException e) {
           System.out.println(e.getMessage());
        } finally {
         try{
                   if(conn != null)
                     conn.close();
         }catch(SQLException ex){
                   System.out.println(ex.getMessage());
         }
       }
        return tiquetesConsulta;
    }
    
    public ArrayList<Tiquete> getTiqueteRevision(Curso curso) throws IOException {
        Connection conn = null;
        ArrayList<Tiquete> tiquetesRevision = new ArrayList<Tiquete>();
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            
            String query = "{ call get_tiquete_revision_curso(?) }";
            ResultSet rs;
            
            CallableStatement stmt = conn.prepareCall(query);
            
            stmt.setInt(1, curso.getId());
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
   
                System.out.println("Ciclo While");
                Revision revision = new Revision();
                Estudiante estudiante = new Estudiante();
                revision.setId(rs.getInt("Id"));
                revision.setFecha(rs.getDate("Fecha_Hora"));
                revision.setHora(rs.getTime("Fecha_Hora"));
                revision.setDescripcion(rs.getString("Descripcion"));
                revision.setEstado(rs.getString("Estado"));
                estudiante.setNombre(rs.getString("Nombre"));
                estudiante.setCarnet(rs.getString("Carnet"));
                estudiante.setCorreo(rs.getString("Correo"));
                System.out.println(estudiante.toString());
                revision.setEstudiante(estudiante);
                
                File file = new File("Revision " + revision.getEstudiante().getNombre() + ".pdf");
                FileOutputStream output = new FileOutputStream(file);
                
                InputStream input = rs.getBinaryStream("Archivo");
                byte[] buffer = new byte[1024];
                while (input.read(buffer) > 0) {
                    output.write(buffer);
                }
                
                tiquetesRevision.add(revision);
            }
            
        } catch(SQLException e) {
           System.out.println(e.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAOTiqueteImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
         try{
                   if(conn != null)
                     conn.close();
         }catch(SQLException ex){
                   System.out.println(ex.getMessage());
         }
       }
        return tiquetesRevision;
    }
}
