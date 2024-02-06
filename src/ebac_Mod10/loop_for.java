package ebac_Mod10;

import java.util.*;

public class loop_for {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número para gerar sua tabuada! : ");
        int num = s.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }


}
