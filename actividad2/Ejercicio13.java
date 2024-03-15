package actividad2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer el valor de la compra y el color de la bolita
        System.out.print("Ingrese el valor de la compra: ");
        double VALCOMP = sc.nextDouble();
        sc.nextLine(); // Limpiar el buffer del teclado después de leer un número
        System.out.print("Ingrese el color de la bolita (BLANCO, VERDE, AMARILLO, AZUL, ROJO): ");
        String COLOR = sc.nextLine().toUpperCase(); // Convertir a mayúsculas para facilitar la comparación

        double VALPAG; // Valor a pagar
        double PDES = 0; // Porcentaje de descuento

        // Determinar el porcentaje de descuento según el color de la bolita
        switch (COLOR) {
            case "BLANCO":
                PDES = 0;
                break;
            case "VERDE":
                PDES = 10;
                break;
            case "AMARILLO":
                PDES = 25;
                break;
            case "AZUL":
                PDES = 50;
                break;
            default:
                // Si el color no es ninguno de los anteriores, se asume que la bolita es roja.
                PDES = 100;
                break;
        }

        // Calcular el valor a pagar con el descuento aplicado
        VALPAG = VALCOMP - (PDES * VALCOMP / 100);

        // Mostrar el valor final a pagar
        System.out.printf("El cliente debe pagar: $%.2f\n", VALPAG);

        sc.close();
    }
}
