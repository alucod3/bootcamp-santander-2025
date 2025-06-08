package java_fundamentos.lista1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Base number input
        System.out.print("Base: ");
        int base = scanner.nextInt();

        // Height number input
        System.out.print("Altura: ");
        int altura = scanner.nextInt();

        // Area calculate...
        int area = base * altura;

        // Response
        System.out.printf("A área do seu retângulo é: %s", area);
    }
}