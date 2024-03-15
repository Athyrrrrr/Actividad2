package actividad2;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer las ventas de los tres departamentos y el salario de los vendedores
        System.out.print("Ingrese las ventas del departamento 1: ");
        double VD1 = sc.nextDouble();
        System.out.print("Ingrese las ventas del departamento 2: ");
        double VD2 = sc.nextDouble();
        System.out.print("Ingrese las ventas del departamento 3: ");
        double VD3 = sc.nextDouble();
        System.out.print("Ingrese el salario de los vendedores: ");
        double SALAR = sc.nextDouble();

        // Calcular el total de ventas y el 33% de ese total
        double TOTVEN = VD1 + VD2 + VD3;
        double PORVEN = 0.33 * TOTVEN;

        // Inicializar los salarios de los vendedores de cada departamento
        double SALAR1 = SALAR;
        double SALAR2 = SALAR;
        double SALAR3 = SALAR;

        // Calcular el salario con incentivos si las ventas superan el 33% del total
        if (VD1 > PORVEN) {
            SALAR1 += 0.2 * SALAR;
        }
        if (VD2 > PORVEN) {
            SALAR2 += 0.2 * SALAR;
        }
        if (VD3 > PORVEN) {
            SALAR3 += 0.2 * SALAR;
        }

        // Mostrar el salario de los vendedores de cada departamento
        System.out.println("Salario vendedores depto. 1: " + SALAR1);
        System.out.println("Salario vendedores depto. 2: " + SALAR2);
        System.out.println("Salario vendedores depto. 3: " + SALAR3);

        sc.close();
    }
}