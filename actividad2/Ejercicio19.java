package actividad2;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar y leer el valor del lado del triángulo equilátero
        System.out.print("Ingrese el valor del lado del triángulo equilátero: ");
        double lado = sc.nextDouble();

        // Calcular el perímetro, la altura y el área del triángulo
        double perimetro = 3 * lado;
        double altura = (Math.sqrt(3) / 2) * lado;
        double area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);

        // Mostrar los resultados
        System.out.println("\nInformación del triángulo equilátero:");
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);

        sc.close();
    }
}
