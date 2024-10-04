package ebac_Mod18.exceptions;

import java.util.Locale;

public class ExemplosExceptions {
    public static void main(String[] args) {
        //lancarExceptions();
        lancarExceptionsFinally();
    }

    private static void lancarExceptions() {
        try {
            String palavra = null;
            String novaPalavra = null;

            palavra = novaPalavra.toUpperCase();
        }
        catch (Exception e) {
            throw new RuntimeException("Não existe palavras para se tornarem maiúsculas!");
        }
    }

    private static void lancarExceptionsFinally() {
        String palavra2 = null;
        String novaPalavra2 = null;
        try {
            palavra2 = novaPalavra2.toUpperCase();
        }
        catch (NullPointerException e) {
            System.out.println("Não existe palavras para se tornarem maiúsculas!");
            palavra2 = "Primeira";
        }
        finally {

            novaPalavra2 = palavra2.toUpperCase();
        }
        System.out.println("Palavra antiga " + palavra2);
        System.out.println("Nova Palavra " + novaPalavra2);
    }
}
