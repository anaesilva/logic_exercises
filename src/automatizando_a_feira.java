import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class automatizando_a_feira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> listaDesejada = new ArrayList<>();
        System.out.println("Informe a lista de frutas desejadas (Digite 'fim' para encerrar):");
        String frutaDesejada = sc.nextLine();
        while (!frutaDesejada.equalsIgnoreCase("fim")) {
            listaDesejada.add(frutaDesejada);
            frutaDesejada = sc.nextLine();
        }

        System.out.println("Informe a lista de frutas compradas (Digite 'fim' para encerrar):");
        List<String> listaCompras = new ArrayList<>();
        String frutaCompra = sc.nextLine();
        while (!frutaCompra.equalsIgnoreCase("fim")) {
            listaCompras.add(frutaCompra);
            frutaCompra = sc.nextLine();
        }

        int totalDesejado = listaDesejada.size();
        int totalCompras = listaCompras.size();

        double correspondencia = (double) totalCompras / totalDesejado * 100;
        double gorjeta = 0.0;

        if (correspondencia >= 90) {
            gorjeta = 10.0;
        } else if (correspondencia >= 75) {
            gorjeta = 5.0;
        } else if (correspondencia >= 50) {
            gorjeta = 3.0;
        }

        System.out.println("Correspondência de " + correspondencia + "%, gorjeta de R$ " + gorjeta);
    }
}
