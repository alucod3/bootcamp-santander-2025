package java_fundamentos.lista2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting weights
        System.out.print("Digite sua altura (em cm): ");
        double alturaCm = scanner.nextDouble() / 100;
        System.out.print("Digite o seu peso (em kg): ");
        double pesoKg = scanner.nextDouble();

        // Calculating...
        double imc = pesoKg / (alturaCm * alturaCm);

        // Showing the IMC
        System.out.printf("\nIMC: %.2f ", imc);

        // Recommend weight
        if (imc < 18.5) {
            System.out.print("-> Abaixo do peso");
        } else if (imc < 25.0) {
            System.out.print("-> Peso ideal");
        } else if (imc < 30.0) {
            System.out.print("-> Levemente acima do peso");
        } else if (imc < 35.0) {
            System.out.print("-> Obesidade Grau I");
        } else if (imc < 40.0) {
            System.out.print("-> Obesidade Grau II (Severa)");
        } else {
            System.out.println("-> Obesidade Grau III (Mórbida)");
        }
    }
}
