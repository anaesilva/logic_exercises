import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class comparacao_lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> lista_promocao = new ArrayList<>();


        for(int i = 1; i <= 5; i++) {
            String fruta = sc.next();
            lista_promocao.add(fruta);
        }

        System.out.println("A lista de frutas em promoção é: " + lista_promocao);

        List<String> lista_compras = new ArrayList<>();

        System.out.println("Por favor digite o numero de frutas que deseja comprar");
        int num_frutas = sc.nextInt();

        System.out.println("Por favor digite as " + num_frutas + " frutas");

        for(int i = 0; i <num_frutas; i++) {
            String fruta = sc.next();
            lista_compras.add(fruta);
        }


        List<String> frutas_promo = new ArrayList<>();

        for(int i = 0; i < lista_promocao.size(); i++) {

            String fruta = lista_promocao.get(i);

            for (int j =0; j< lista_compras.size(); j++){

                if (fruta.equals(lista_compras.get(j))){
                    frutas_promo.add(lista_compras.get(j));
                }
            }
        }

        System.out.println("Você tem direito a um desconto de " + frutas_promo.size() * 5 + "%" + " e as frutas na promoção são: " + frutas_promo);

    }
}
