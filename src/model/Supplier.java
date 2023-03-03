package model;

//esta es la clase proveedor que hereda de Person
public class Supplier extends Person {
    private  String web;
    public Supplier(String rut, String name, String direccion, String telefono, String web) {
        super(rut, name, direccion, telefono);
        this.web = web;

    }
}
