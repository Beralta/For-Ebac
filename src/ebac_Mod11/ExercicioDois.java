package ebac_Mod11;
import java.util.Arrays;
import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos nomes deseja inserir?: ");
        int tamanhoArray = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new String[tamanhoArray];
        String[] sexos = new String[tamanhoArray];

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Insira o nome e o sexo separados por um traço (Exemplo: Pedro - M): ");
            String entrada = scanner.nextLine();
            String[] partes = entrada.split("-");


            if (partes.length != 2) {
                System.out.println("Formato inválido. Tente novamente.");
                i--; //
                continue;
            }

            nomes[i] = partes[0].trim();
            sexos[i] = partes[1].trim().toUpperCase();
        }

        System.out.println("\nNomes Masculinos:");
        for (int i = 0; i < tamanhoArray; i++) {
            if (sexos[i].equals("M")) {
                System.out.println(nomes[i]);
            }
        }

        System.out.println("\nNomes Femininos:");
        for (int i = 0; i < tamanhoArray; i++) {
            if (sexos[i].equals("F")) {
                System.out.println(nomes[i]);
            }
        }


    }

}
