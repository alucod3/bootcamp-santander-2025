package java_fundamentos.contabanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta:\n ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Saldo da conta: ");
        double saldo = scanner.nextDouble();

        // Result
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.\n" +
                "Sua agência é %s, conta %s e seu saldo %s já está disponível para saque.", nomeCliente, numero, agencia, saldo);

    }

}
