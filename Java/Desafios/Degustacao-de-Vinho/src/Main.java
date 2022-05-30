import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int T = Integer.parseInt(scan.nextLine());
            // Verifica se T é um número válido;
            if (T >= 1 && T <= 4) {
                String respostasCompetidores = scan.nextLine();
                String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");

                int teste = respostasCompetidoresSplit.length;
                System.out.println(teste);

                // Verifica se dos votos dos competidores é válida;
                if (teste == 5) {
                    // Verifica se dos votos dos competidores está no intervalo válido;
                    int valorVoto;
                    boolean votosValidos = true;
                    for (String value : respostasCompetidoresSplit) {
                        valorVoto = Integer.parseInt(value);
                        if (valorVoto < 1 || valorVoto > 4)
                            votosValidos = false;
                    }
                    // Conta votos
                    int count = 0;
                    if (votosValidos) {
                        for (String s : respostasCompetidoresSplit) {
                            if (Integer.parseInt(s) == T)
                                count++;
                        }
                        System.out.println(count);
                    } else
                        System.out.println("Valores dos votos fora do intervalo permitido.");
                } else
                    System.out.println("Quantidade de votos inválido.");
            } else
                System.out.println("Número fora do intervalo permitido.");
        } catch (NumberFormatException e) {
            System.out.println("Número inválido");
        }
    }
}