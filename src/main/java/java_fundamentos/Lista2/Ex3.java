package java_fundamentos.Lista2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Receive 2 numbers
        System.out.print("Primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Segundo número (maior que primeiro): ");
        int num2 = scanner.nextInt();

        // Handling error
        if (num1 > num2) {
            System.out.println("\nError: O segundo número deve ser maior... Número invalido");
            return;
        }

        // Receiving "par" or "impar"
        System.out.print("Digite 'par' ou 'impar': ");
        String parOuImpar = scanner.next();
        if (parOuImpar.equals("impar".toLowerCase())) {
            while (num1 <= num2) {
                int impares = num1 % 2;
                if (impares != 0) {
                    System.out.printf("%s ", num1);
                }
                num1++;
            }
        } else if (parOuImpar.equals("par".toLowerCase())) {
            while (num1 <= num2) {
                int pares = num1 % 2;
                if (pares != 1) {
                    System.out.printf("%s ", num1);
                }
                num1++;
            }
        } else {
            // If something goes wrong, it will fall here
            System.out.println("Os números não seguiram os padrões requiridos");
        }
    }
}
