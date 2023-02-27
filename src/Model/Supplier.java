package Model;

import Model.Address;

//esta es la clase proveedor que hereda de Person
public class Supplier extends Person {
    private  String web;
    public Supplier(int rut, String name, Address direccion, int telefono, String web) {
        super(rut, name, direccion, telefono);
        this.web = web;

    }
}
