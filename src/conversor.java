import java.util.Scanner;

public class conversor {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit: ");

                int temperatura = sc.nextInt();

                System.out.print("O equivalente a " + temperatura + " C é " + ((temperatura * 9/5) + 32) + " F");

        }
}
