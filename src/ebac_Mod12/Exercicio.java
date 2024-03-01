package ebac_Mod12;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Exercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> pessoa = new HashMap<>();
        ArrayList<String> feminino = new ArrayList<>();
        ArrayList<String> masculino = new ArrayList<>();


        System.out.print("Quantas pessoas você quer incluir? ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantity; i++){
            System.out.println("Digite seu Sexo e em seguida o seu nome: ");
           String sexo = scanner.next();
           String nome = scanner.nextLine().trim();

           pessoa.put(sexo, nome);

            if(sexo.equalsIgnoreCase("feminino")){
                feminino.add(nome);
            }
            else if(sexo.equalsIgnoreCase("masculino")){
                masculino.add(nome);
            }
            else {
                System.out.println("Sexo inválido: "+ sexo);
            }
        }

        System.out.println("Homens: ");
        System.out.println(masculino);
        System.out.println("Mulheres: ");
        System.out.println(feminino);


    }
}
