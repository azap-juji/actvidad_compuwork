package com.mycompany.sistemaempleados;

public class Departamento {

    private final int id;
    private final String nombre;

    public Departamento(int id, String nombre, String medellin) {
        this(id, nombre);
    }

    public Departamento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void mostrarDepartamento() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
    }
}