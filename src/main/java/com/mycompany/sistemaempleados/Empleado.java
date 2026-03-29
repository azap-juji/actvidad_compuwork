package com.mycompany.sistemaempleados;

public class Empleado {

    private int id;
    private String nombre;
    private String cargo;

    public Empleado(int id, String nombre, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public void mostrarEmpleado() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
    }

    public double calcularSalario() {
        return 0;
    }
}