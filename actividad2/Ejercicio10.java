package actividad2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar y leer los datos del estudiante
        System.out.print("Ingrese el número de inscripción: ");
        String numeroInscripcion = sc.nextLine();

        System.out.print("Ingrese los nombres del estudiante: ");
        String nombres = sc.nextLine();

        System.out.print("Ingrese el patrimonio: ");
        double patrimonio = sc.nextDouble();

        System.out.print("Ingrese el estrato social: ");
        int estratoSocial = sc.nextInt();

        // Valor constante de la matrícula
        double pagoMatricula = 50000;

        // Comprobar si se deben aplicar incrementos
        if (patrimonio > 2000000 && estratoSocial > 3) {
            pagoMatricula += 0.03 * patrimonio;
        }

        // Mostrar los resultados
        System.out.println("El estudiante con número de inscripción " + numeroInscripcion +
                           " y nombre " + nombres + " debe pagar: $" + pagoMatricula);

        sc.close();
    }
}