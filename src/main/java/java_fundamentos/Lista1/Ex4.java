package java_fundamentos.Lista1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Name input
        System.out.print("Nome: ");
        String name1 = scanner.next();
        // Age input
        System.out.print("Idade: ");
        int age1 = scanner.nextInt();

        // A new person
        System.out.println("Ok, vamos para a segunda pessoa: ");
        // Name input
        System.out.print("Nome: ");
        String name2 = scanner.next();
        //Age input
        System.out.print("Idade: ");
        int age2 = scanner.nextInt();

        // Creating a new result
        int resultAge;

        if (age1 > age2) {
          resultAge = age1 - age2;
        } else {
          resultAge = age2 - age1;
        }

        System.out.printf("A diferença de idade entre %s e %s é de: %s anos", name1, name2, resultAge);
    }
}
