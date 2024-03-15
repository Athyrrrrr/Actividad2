package actividad2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar y leer los datos del trabajador
        System.out.print("Ingrese el nombre del trabajador: ");
        String NOM = sc.nextLine();

        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        int NHT = sc.nextInt();

        System.out.print("Ingrese el valor de la hora normal de trabajo: ");
        double VHN = sc.nextDouble();

        // Inicializar las variables de horas extras y salario
        int HET = 0; // Horas extras trabajadas
        int HEE8 = 0; // Horas extras que exceden de 8
        double SALARIO; // Salario total

        // Calcular el salario según las horas trabajadas
        if (NHT > 40) {
            HET = NHT - 40;
            if (HET > 8) {
                HEE8 = HET - 8;
                SALARIO = (40 * VHN) + (8 * 2 * VHN) + (HEE8 * 3 * VHN);
            } else {
                SALARIO = (40 * VHN) + (HET * 2 * VHN);
            }
        } else {
            SALARIO = NHT * VHN;
        }

        // Mostrar el resultado
        System.out.println("El trabajador " + NOM + " devengó: $" + SALARIO);

        sc.close();
    }
}
