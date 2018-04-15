package model;

public class ConsultaFactory extends Factory{
    public Tiquete factoryMethod() {
        return new Consulta();
    }
}
