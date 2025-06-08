package java_fundamentos.lista2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read base number
        System.out.print("Digite o número base -> ");
        int numBase = scanner.nextInt();

        int chute;

        do {
            System.out.print("Digite outro número -> ");
            chute = scanner.nextInt();

            // Ignores if: less than base number
            if (chute < numBase) {
                System.out.println("Número ignorado (menor que o número base).");
                continue; // back to loop start
            }

            // If it is not divisible: it comes out of the loop
            if (chute % numBase != 0) {
                System.out.println("Número não divisível por " + numBase + ". Encerrando.");
                break;
            }

            // For didactic purposes: show that have been accepted
            System.out.println("Número aceito (divisível por " + numBase + ").");

        } while (true); // Infinite loop with break-controlled output
    }
}

