import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;

        try{
            double R = sc.nextDouble();
            if (R >= 0){
                double volume = (4.0/3.0) * pi * (Math.pow(R, 3.0));
                System.out.printf("VOLUME = %.3f%n", volume);
            }else
                System.out.println("Número inválido.");

        } catch (Exception e) {
            System.out.println("Valor informado não é um número válido.");
        }
    }
}