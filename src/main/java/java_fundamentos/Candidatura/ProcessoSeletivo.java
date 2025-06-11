package java_fundamentos.Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"BRUNO", "MIRELA", "CARLA", "JOÃO", "LARISSA"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    // Efetuar ligações
    private static void entrandoEmContato(String candidato) {
        int chamadasRealizadas = 1;
        boolean continuarChamando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarChamando = !atendeu;
            if (continuarChamando) {
                chamadasRealizadas++;
            } else {
                System.out.println();
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }
        } while (continuarChamando && chamadasRealizadas < 3);
        if (atendeu) {
            System.out.printf("CONSEGUIMOS CONTATO COM %s NA %s TENTATIVA\n", candidato, chamadasRealizadas);
        } else {
            System.out.printf("NÃO CONSEGUIMOS CONTATO COM %s, NÚMERO MÁXIMO DE TENTATIVAS %s\n", candidato, chamadasRealizadas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void selecaoCandidatos() {
        String[] candidatos = {
                "BRUNO", "MIRELA", "CARLA", "JOÃO", "LARISSA", "PEDRO", "ANA", "RAFAEL", "JULIA", "FELIPE", "GUILHERME"
        };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou este valor de salário: R$%s\n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                String[] guardarCandidato = new String[]{candidato};
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    // Imprime os candidatos selecionados
    static void imprimirSelecionados() {
        String[] candidatos = {"BRUNO", "MIRELA", "CARLA", "JOÃO", "LARISSA"};

        System.out.println("===== SELECIONADOS =====");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.printf("O candidato de n°%s, é %s\n", i + 1, candidatos[i]);
        }
    }


    // Gera um valor (double) aleatório
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Analisa o candidato conforme pretensão salarial
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        } else if (salarioBase < salarioPretendido) {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
