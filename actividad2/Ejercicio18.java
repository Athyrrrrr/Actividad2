package actividad2;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar y leer la información del empleado
        System.out.print("Ingrese el código del empleado: ");
        String codigoEmpleado = sc.nextLine();

        System.out.print("Ingrese los nombres del empleado: ");
        String nombres = sc.nextLine();

        System.out.print("Ingrese el número de horas trabajadas al mes: ");
        int horasTrabajadas = sc.nextInt();

        System.out.print("Ingrese el valor por hora trabajada: ");
        double valorHoraTrabajada = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de retención en la fuente: ");
        double porcentajeRetencion = sc.nextDouble();

        // Calcular el salario bruto, retención y salario neto
        double salarioBruto = horasTrabajadas * valorHoraTrabajada;
        double retencion = salarioBruto * (porcentajeRetencion / 100);
        double salarioNeto = salarioBruto - retencion;

        // Mostrar los resultados
        System.out.println("\nInformación del empleado:");
        System.out.println("Código: " + codigoEmpleado);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Retención en la fuente: $" + retencion);
        System.out.println("Salario neto: $" + salarioNeto);

        sc.close();
    }
}
