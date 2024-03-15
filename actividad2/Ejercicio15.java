package actividad2;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer el peso de las cuatro esferas
        System.out.print("Ingrese el peso de la esfera A: ");
        double PESOA = sc.nextDouble();
        System.out.print("Ingrese el peso de la esfera B: ");
        double PESOB = sc.nextDouble();
        System.out.print("Ingrese el peso de la esfera C: ");
        double PESOC = sc.nextDouble();
        System.out.print("Ingrese el peso de la esfera D: ");
        double PESOD = sc.nextDouble();

        // Determinar la esfera de diferente peso
        if (PESOA == PESOB && PESOA == PESOC) {
            System.out.print("La esfera D es la diferente y es de ");
            System.out.println((PESOD > PESOA) ? "mayor peso." : "menor peso.");
        } else if (PESOA == PESOB && PESOA == PESOD) {
            System.out.print("La esfera C es la diferente y es de ");
            System.out.println((PESOC > PESOA) ? "mayor peso." : "menor peso.");
        } else if (PESOA == PESOC && PESOA == PESOD) {
            System.out.print("La esfera B es la diferente y es de ");
            System.out.println((PESOB > PESOA) ? "mayor peso." : "menor peso.");
        } else {
            System.out.print("La esfera A es la diferente y es de ");
            System.out.println((PESOA > PESOB) ? "mayor peso." : "menor peso.");
        }

        sc.close();
    }
}
