package ebac_Mod18.exceptions;

import java.util.Locale;

public class ExemplosExceptions {
    public static void main(String[] args) {
        lancarExceptions();
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
}
