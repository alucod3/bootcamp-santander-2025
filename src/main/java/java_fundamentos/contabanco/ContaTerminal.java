package java_fundamentos.contabanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da sua Agência: ");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Saldo da sua conta: ");
        double saldo = scanner.nextDouble();

        // Result
        System.out.printf("Olá %s, sua conta de Número %s, da Agência %s, possui %sR$", nomeCliente, numero, agencia, saldo);

    }

}
