package ebac_Mod17.generic;

import java.util.ArrayList;
import java.util.List;

public class ExemploJavaGeneric {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("pedro");
        lista.add(43);
        imprimir(lista);

    }

    public static void imprimir(List<String> lista){
        for(String st : lista) {
            System.out.println(lista);
        }

        List<String> listnome = new ArrayList();
        listnome.add("marcos");
        listnome.add("mateus");

       // public static <T> void pegarnomes(List<T>)

    }
}
