package actividad2;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de C: ");
        double c = scanner.nextDouble();

        // Cálculo del discriminante
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        // Verificación de las posibles soluciones
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La solución única es x = " + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }

        scanner.close();
    }
}
