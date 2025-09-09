// Ejercicio 03
//Calcular la suma de los primeros términos de la serie: N
//1 - 1/√3 + 1/√5 - 1/√7 + ...

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de términos: ");
        int n = scanner.nextInt();

        double suma = calcularSerie(n);

        System.out.println("La suma de los primeros " + n + " términos es: " + suma);

        scanner.close();
    }

    private static double calcularSerie(int n) {
        double suma = 0.0;

        for (int i = 0; i < n; i++) {
            int denominador = 2 * i + 1;
            double termino = 1.0 / Math.sqrt(denominador);

            if (i % 2 == 0) {
                suma += termino;
            } else {
                suma -= termino;
            }
        }

        return suma;
    }
}