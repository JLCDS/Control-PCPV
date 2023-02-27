package Model;

//Super clase: contiene los parametros que se repiten entre proveedpor y cliente
public class Person {
    protected int rut;
    protected  String name ;
    protected Address direccion;
    protected int telefono;


    public Person(int rut, String name, Address direccion, int telefono) {
        this.rut = rut;
        this.name = name;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getDireccion() {
        return direccion;
    }

    public void setDireccion(Address direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

