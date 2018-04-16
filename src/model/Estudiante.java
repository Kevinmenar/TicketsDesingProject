package model;

public class Estudiante {
    private String nombre;
    private String correo;
    private String carnet;

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", correo=" + correo + ", carnet=" + carnet + '}';
    }    
}
