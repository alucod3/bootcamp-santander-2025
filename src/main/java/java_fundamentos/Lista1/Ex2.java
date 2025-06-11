package java_fundamentos.Lista1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("O tamanho do lado de um quadrado (em metros): ");
        int lado = scanner.nextInt();

        int area = lado * lado;
        System.out.printf("O tamanho da área é de %sm²", area);
    }
}