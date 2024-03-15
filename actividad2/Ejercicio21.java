package actividad2;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar y leer los valores de los lados del triángulo
        System.out.print("Ingrese el valor del primer lado del triángulo: ");
        double lado1 = sc.nextDouble();

        System.out.print("Ingrese el valor del segundo lado del triángulo: ");
        double lado2 = sc.nextDouble();

        System.out.print("Ingrese el valor del tercer lado del triángulo: ");
        double lado3 = sc.nextDouble();

        // Calcular el perímetro y el semiperímetro del triángulo
        double perimetro = lado1 + lado2 + lado3;
        double semiperimetro = perimetro / 2;

        // Calcular el área del triángulo usando la fórmula de Herón
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

        // Mostrar los resultados
        System.out.println("\nInformación del triángulo:");
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Semiperímetro: " + semiperimetro);
        System.out.println("Área: " + area);

        sc.close();
    }
}
