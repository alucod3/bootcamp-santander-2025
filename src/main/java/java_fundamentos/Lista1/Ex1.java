package java_fundamentos.Lista1;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Ex1 {

    // Inicializa com o ano atual
    static int BASE_YEAR = OffsetDateTime.now().getYear();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String name = scanner.nextLine();
        System.out.print("Digite o seu ano de nascimento: ");
        int year = scanner.nextInt();

        int age = BASE_YEAR - year;
        System.out.printf("Olá, %s você tem %s anos", name, age);
    }
}
