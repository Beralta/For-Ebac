package ebac_Mod10;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        for(int i = 1; i <= 4; i++) {
            System.out.println("Digite a " + i + "° nota: ");
            int lerNota = ler.nextInt();
            if (lerNota >= 7) {
                System.out.println("Aprovado!");
            } else if(lerNota >= 5) {
                System.out.println("Recuperação!");
            } else {
                System.out.println("Reprovado!");
            }
        }




    }
}
