package model;

//Super clase: contiene los parametros que se repiten entre proveedpor y cliente
public class Person {
    protected String rut;
    protected  String name ;
    protected String direccion;
    protected String telefono;


    public Person(String rut, String name, String direccion, String telefono) {
        this.rut = rut;
        this.name = name;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

