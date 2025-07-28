import java.util.*;

public class Ppt {

    public static void main(String[] args) {
        Hashtable<Integer, String> desenho = new Hashtable<>();
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();

        int jogador;
        int maquina;

        String pedra = ( """
                _____
            ---' ____)
                (_____)
                (_____)
                (____)
          ---.__(___)
            """ );
    
        String papel = ( """
                _____
            ---' ____)____
                    ______)
                    _______)
                    _______)
            ---.__________)
            """ );

        String tesoura = ( """
                _____
            ---' ____)____
                    ______)
                __________)
                (____)
          ---.__(___)
            """ );

        // chaveando as alternativas com os desenhos
        desenho.put(0, pedra);
        desenho.put(1, papel);
        desenho.put(2, tesoura);


        maquina = gerador.nextInt(3);

        // menu
        System.out.println("0 - pedra" + desenho.get(0));
        System.out.println("1 - papel"+ desenho.get(1));
        System.out.println("2 - tesoura"+ desenho.get(2));

        // validacao para nao passar outra alterantiva
        do {
            System.out.print("Jogador, insira sua jogada (0, 1 ou 2): ");
            jogador = leitor.nextInt();
            if (jogador < 0 || jogador > 2) {
                System.out.println("Entrada inválida! Tente novamente.");
            }
        } while (jogador < 0 || jogador > 2);

        // mostra escolhas dos jogadores
        System.out.println("Sua jogada foi: " + jogador + desenho.get(jogador));
        System.out.println("A jogada da maquina foi: " + maquina + desenho.get(maquina));

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

