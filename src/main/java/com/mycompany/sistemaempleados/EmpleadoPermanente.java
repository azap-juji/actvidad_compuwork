package com.mycompany.sistemaempleados;

public class EmpleadoPermanente extends Empleado {

    private final double salario;

    public EmpleadoPermanente(int id, String nombre, String cargo, double salario) {
        super(id, nombre, cargo);
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}