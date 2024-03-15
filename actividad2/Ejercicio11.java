package actividad2;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer los tres números enteros
        System.out.print("Ingrese el primer número (N1): ");
        int N1 = sc.nextInt();

        System.out.print("Ingrese el segundo número (N2): ");
        int N2 = sc.nextInt();

        System.out.print("Ingrese el tercer número (N3): ");
        int N3 = sc.nextInt();

        int MAYOR; // Variable para almacenar el número mayor

        // Determinar cuál de los números es el mayor
        if (N1 > N2 && N1 > N3) {
            MAYOR = N1;
        } else if (N2 > N3) {
            MAYOR = N2;
        } else {
            MAYOR = N3;
        }

        // Mostrar el número mayor
        System.out.println("El valor mayor entre: " + N1 + ", " + N2 + " y " + N3 + " es: " + MAYOR);

        sc.close();
    }
}
