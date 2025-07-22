import java.util.*;

public class Ppt {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();

        int jogador;
        int maquina;

        maquina = gerador.nextInt(3);

        // menu
        System.out.println("0 - pedra");
        System.out.println("1 - papel");
        System.out.println("2 - tesoura");

        do {
            System.out.print("Jogador, insira sua jogada (0, 1 ou 2): ");
            jogador = leitor.nextInt();
            if (jogador < 0 || jogador > 2) {
                System.out.println("Entrada inválida! Tente novamente.");
            }
        } while (jogador < 0 || jogador > 2);

        // chama o método estático para verificar o resultado
        possibilidade(jogador, maquina);
        
        leitor.close();
    }

    // Método estático para poder ser chamado do main
    public static void possibilidade(int jogador, int maquina) {

        if (jogador == maquina) {
            System.out.println("Empate!");
        } else if ((jogador == 0 && maquina == 2) ||
                   (jogador == 1 && maquina == 0) ||
                   (jogador == 2 && maquina == 1)) {
            System.out.println("Jogador venceu!");
        } else {
            System.out.println("Máquina venceu!");
        }

    }
}
