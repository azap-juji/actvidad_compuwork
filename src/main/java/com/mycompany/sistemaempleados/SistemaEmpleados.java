package com.mycompany.sistemaempleados;

public class SistemaEmpleados {

    public static void main(String[] args) {

        try {

            EmpleadoPermanente emp1 = new EmpleadoPermanente(1, "Juan", "Programador", 3000);
            EmpleadoTemporal emp2 = new EmpleadoTemporal(2, "Ana", "Programadora", 40, 10);

            Departamento dep = new Departamento(1, "Sistemas");

            ReporteDesempeno rep = new ReporteDesempeno("Juan", 90);

            emp1.mostrarEmpleado();
            System.out.println("Salario: " + emp1.calcularSalario());

            System.out.println("------------------");

            emp2.mostrarEmpleado();
            System.out.println("Pago: " + emp2.calcularSalario());

            System.out.println("------------------");

            dep.mostrarDepartamento();

            System.out.println("------------------");

            rep.mostrarReporte();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
