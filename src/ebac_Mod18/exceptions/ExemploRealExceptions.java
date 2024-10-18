package ebac_Mod18.exceptions;

public class ExemploRealExceptions {

    public static void main(String[] args) {
        resgatar(600);
    }

    public static void resgatar(int valor) throws Exception {

        Pessoa pessoa = new Pessoa();
        int conta = pessoa.getValor_In_Count();

        try {
            if (valor > conta) {
                Exception erro =
                        new Exception("O valor é maior do que está na sua conta!");
                throw erro;
            } else {
                System.out.print("Valor retirado!");
            }
        } finally {
            System.out.print("Tenha um bom dia");

        }

    }


}
