package actividad2;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el peso de la esfera A: ");
        double pesoA = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera B: ");
        double pesoB = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera C: ");
        double pesoC = scanner.nextDouble();

        // Determinación de la esfera de mayor peso
        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera de mayor peso es A con un peso de " + pesoA);
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera de mayor peso es B con un peso de " + pesoB);
        } else {
            System.out.println("La esfera de mayor peso es C con un peso de " + pesoC);
        }
        scanner.close();
    }
}
