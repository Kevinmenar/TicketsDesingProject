package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Revision extends Consulta{
    private String descripcion;
    private TipoEvaluacion tipoEvaluacion;

    public Revision() {
    }

    public TipoEvaluacion getTipoEvaluacion() {
        return tipoEvaluacion;
    }

    public void setTipoEvaluacion(TipoEvaluacion tipoEvaluacion) {
        this.tipoEvaluacion = tipoEvaluacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Revision{" + "descripcion=" + descripcion + ", tipoEvaluacion=" + tipoEvaluacion + '}';
    }
    
    
    
}
