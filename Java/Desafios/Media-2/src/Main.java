import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double nota3 = input.nextDouble();

        try {
            double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
            System.out.printf("MEDIA = %.1f", media);
        } catch (Exception e) {
            System.out.println("Valor inserido não é um número válido.");
        }
    }
}