package actividad2;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer los valores numéricos A y B
        System.out.print("Ingrese el valor de A: ");
        double A = sc.nextDouble();

        System.out.print("Ingrese el valor de B: ");
        double B = sc.nextDouble();

        // Comparar A con B y mostrar el mensaje correspondiente
        if (A > B) {
            System.out.println("A es mayor que B");
        } else if (A == B) {
            System.out.println("A es igual a B");
        } else {
            System.out.println("A es menor que B");
        }

        sc.close();
    }
}

