package contador;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        try {
        	iniciar(terminal);
            System.out.println("Deseja continuar? (1) sim / (2) não: ");
            int continuar = terminal.nextInt();
            if (continuar == 1) {
                iniciar(terminal);
            }
        } catch (Exception e) {
            System.out.println("Exceção: " + e.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void iniciar(Scanner terminal) {
        try {
            int paramum = 0;
            int paramdois = 0;

            System.out.println("Digite o Primeiro Numero: ");
            paramum = terminal.nextInt();

            System.out.println("Digite o Segundo Numero: ");
            paramdois = terminal.nextInt();

            if (paramum > paramdois) {
                throw new ValidaRegra("O Primeiro Numero não pode ser maior que o segundo!");
            }

            contar(paramum, paramdois);

        } catch (Exception e) {
            System.out.println("Exceção: " + e.getMessage());
            
        }
    }

    static void contar(int paramum, int paramdois) {
        int cont = paramdois - paramum;

        for (int i = 0; i <= cont; i++) {
            System.out.println("Imprimindo o Numero: " + (i + 1));
        }
    }
}
