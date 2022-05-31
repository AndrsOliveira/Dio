import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String valor = scan.nextLine();
        String[] split = valor.split(" ");

        try{
            if (split.length != 2)
                System.out.println("Número de parâmetros inválido.");
            else {
                int N = Integer.parseInt(split[0]);
                int L = Integer.parseInt(split[1]);

                if (N >= 3 && N <= 1000000) {
                    if (L >= 1 && L <= 4000) {
                        int P = N * L;
                        System.out.println(P);
                    } else
                        System.out.println("Valor de L fora do intervalo permitido.");
                } else
                    System.out.println("Valor de N fora do intervalo permitido");
            }
        } catch (NumberFormatException e) {
            System.out.println("Número inválido.");
        }
    }
}