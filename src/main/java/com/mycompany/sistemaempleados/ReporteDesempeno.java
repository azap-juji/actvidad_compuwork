package com.mycompany.sistemaempleados;

public class ReporteDesempeno {

    private String nombreEmpleado;
    private int puntuacion;

    public ReporteDesempeno(String nombreEmpleado, int puntuacion) throws Exception {

        this(puntuacion, nombreEmpleado, 9, "Buen desempe");
    }

    public ReporteDesempeno(int puntuacion, String nombreEmpleado, int par1, String buen_desempe) throws Exception {
        if (nombreEmpleado == null || nombreEmpleado.equals("")) {
            throw new Exception("Nombre de empleado no válido");
        }
        this.nombreEmpleado = nombreEmpleado;
        this.puntuacion = puntuacion;
    }

    public void mostrarReporte() {
        System.out.println("Empleado: " + nombreEmpleado);
        System.out.println("Puntuacion: " + puntuacion);
    }
}