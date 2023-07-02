import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class promocao_fruta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> promocao = new ArrayList<>();

        for(int i = 1; i <= 5; i++) {
            String fruta = sc.nextLine();
            promocao.add(fruta);
        }

        System.out.println("A lista de frutas em promoção é: " + promocao);

        System.out.println("Qual fruta você deseja comprar hoje?");
        String escolha_fruta = sc.nextLine();

        boolean esta_na_promocao = promocao.contains(escolha_fruta);

        if (esta_na_promocao == true) {
            System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
        }
        else {
            System.out.println("Essa fruta não está em promoção hoje :( ");
        }
    }
}
