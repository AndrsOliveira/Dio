import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> setFig = new HashSet<>();

        try {
            int n = scan.nextInt();
            while (n < 1 || n > 100) {
                System.out.println("Número informado fora do intervalo válido.");
                n = scan.nextInt();
            }

            int m = scan.nextInt();
            while (m < 1 || m > 300) {
                System.out.println("Número informado fora do intervalo válido.");
                m = scan.nextInt();
            }

            int x ;
            for (int i = 0; i < m; i++) {
                x = scan.nextInt();
                while (x < 1 || x > n) {
                    System.out.println("Número informado fora do intervalo válido.");
                    x = scan.nextInt();
                }
                setFig.add(x);
            }
            scan.close();
            System.out.println(n - setFig.size());
        } catch (Exception e) {
            System.out.println("Número inválido");
        }
    }
}