package ebac_Mod18.exceptions;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Valor do produto: ");
        double valor = s.nextDouble();
        System.out.print("Valor da entrada: ");
        double entrada = s.nextDouble();
        System.out.print("Quantas parcelas: ");
        int parcelas = s.nextInt();

        try {
            Pessoa pedro = new Pessoa(valor, entrada, parcelas);
            System.out.println(pedro.prestacao());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
