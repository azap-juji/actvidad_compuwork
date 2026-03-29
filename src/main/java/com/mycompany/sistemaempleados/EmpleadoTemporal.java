package com.mycompany.sistemaempleados;

public class EmpleadoTemporal extends Empleado {

    private final int horas;
    private final double pagoHora;

    public EmpleadoTemporal(int id, String nombre, String cargo, int horas, double pagoHora) {
        super(id, nombre, cargo);
        this.horas = horas;
        this.pagoHora = pagoHora;
    }

    public double calcularSalario() {
        return horas * pagoHora;
    }
}