package java_fundamentos.Lista2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Table
        System.out.print("Digite o número que deseja a tabuada: ");
        int num = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            int result = i * num;
            System.out.printf("%s x %s = %s \n", i, num, result);
        }
    }

}
