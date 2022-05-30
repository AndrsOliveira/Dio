import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] inputSplit = input.split(" ");

        // Verifica se entrada é valida
        while(inputSplit.length != 2){
            System.out.println("Entrada inválida");
            input = scan.nextLine();
            inputSplit = input.split(" ");
        }

        double H = Double.parseDouble(inputSplit[0]);
        double P = Double.parseDouble(inputSplit[1]);

        // Verifica se números estão no intervalo e calcula
        if (P != 0){
            if (H >= 1 && P <= 1000){
                double media = H / P;
                System.out.printf("%.2f",media);
            }else
                System.out.println("Números informados fora do intervalo permitido.");
        }else
            System.out.println("Não é possível dividir por zero.");
    }
}