
import com.mycompany.sistemaempleados.Departamento;
import com.mycompany.sistemaempleados.EmpleadoPermanente;
import com.mycompany.sistemaempleados.EmpleadoTemporal;
import com.mycompany.sistemaempleados.ReporteDesempeno;

public class Main {

    public static void main(String[] args) {

        try {

            // Crear empleados
            EmpleadoPermanente emp1 = new EmpleadoPermanente(1, "Juan", "Programador", 3000);
            EmpleadoTemporal emp2 = new EmpleadoTemporal(2, "Ana", "Programadora", 40, 10);

            // Crear departamento
            Departamento dep = new Departamento(1, "Sistemas");

            // Crear reporte
            ReporteDesempeno rep = new ReporteDesempeno("Juan", 90);

            // Mostrar datos
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