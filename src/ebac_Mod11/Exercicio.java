package ebac_Mod11;
import java.util.Scanner;
import java.util.Arrays;


public class Exercicio {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Digite o nome das pessoas separados por vírgula: ");
            String entrada = scanner.nextLine();

            String[] nomes = entrada.split(",");

            for (int i = 0; i < nomes.length; i++) {
                nomes[i] = nomes[i].trim();
            }

            Arrays.sort(nomes);


            System.out.println("Nomes em ordem alfabética:");
            System.out.println(String.join(", ", nomes));




        }

    }









