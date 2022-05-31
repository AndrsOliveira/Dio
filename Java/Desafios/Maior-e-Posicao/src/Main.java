import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        try{
            for(int i = 0; i < 10; i++){
                int numero = scan.nextInt();
                numeros.add(numero);
            }

            Integer max = Collections.max(numeros);
            System.out.println(max);
            int position = numeros.indexOf(max) + 1;
            System.out.println(position);
        } catch (Exception e) {
            System.out.println("Valor informado não é um número válido");
        }
    }
}