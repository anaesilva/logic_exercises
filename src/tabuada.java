import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 10: ");
        int numero = sc.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido. Por favor, digite um número entre 1 e 10.");
        } else {
            System.out.println("Tabuada de multiplicação do número " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }

        sc.close();
    }
}