import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Processo[] processos = new Processo[5];

        processos[0] = new Processo("Cadastro", 3);
        processos[1] = new Processo("Login", 5);
        processos[2] = new Processo("Pagamento", 6);
        processos[3] = new Processo("Entrega", 4);
        processos[4] = new Processo("Suporte", 7);

        int somaEtapas = 0;

        System.out.println("Processos com mais de 4 etapas:");
        for (int i = 0; i < processos.length; i++) {
            somaEtapas += processos[i].etapas;

            if (processos[i].etapas > 4) {
                System.out.println("- " + processos[i].nome + " (" + processos[i].etapas + " etapas)");
            }
        }

        double media = (double) somaEtapas / processos.length;
        System.out.println("\nMédia de etapas: " + media);
    }
}

class Processo {
    String nome;
    int etapas;

    public Processo(String nome, int etapas) {
        this.nome = nome;
        this.etapas = etapas;
    }
}
