
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        int suma = calcularSumaConsecutivos(n);

        System.out.println("La suma de los primeros " + n + " números consecutivos es: " + suma);

        scanner.close();

        }

    private static int calcularSumaConsecutivos(int n) {
        return n * (n + 1) / 2;
    }

}