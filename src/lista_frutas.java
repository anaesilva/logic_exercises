import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lista_frutas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> frutas = new ArrayList<>();

        System.out.println("Insira a sua lista de compras:\n");
            for (int i = 1; i <= 5; i++) {


                String fruta = sc.nextLine();

                frutas.add(fruta);

            }

        System.out.print("As frutas no seu carrinho são: \n" + frutas);



        }
}
