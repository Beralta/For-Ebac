package ebac_Mod10;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int somaNota = 0;
        for(int i = 1; i <= 4; i++) {
            System.out.println("Digite a " + i + "° nota: ");
            int lerNota = ler.nextInt();
            somaNota += lerNota;
        }

        int mediaNota = somaNota / 4;
        if (mediaNota >= 7) {
            System.out.println("Aprovado!");
        } else if(mediaNota >= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }




    }
}
