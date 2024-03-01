package ebac_Mod11;
import java.util.Scanner;
import java.util.Arrays;


public class MeuExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas que dejesa registrar: ");
        int quantidade = scanner.nextInt();

        String[] nome = new String[quantidade];
        String[] sexo = new String[quantidade];

        for(int i = 0; i < quantidade; i++) {
            System.out.println("Insira o nome e o sexo separados por um traço ( - )");
            String inpName = scanner.nextLine();
            String[] partes = inpName.split("-");
        }



    }


}
