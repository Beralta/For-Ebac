package ebac_Mod18.reflections;

import java.lang.reflect.Field;

public class ReflexaoYT {

    public static void refletirObjeto(Object obejeto, Class classe) {
        System.out.println("Nome da classe: " + classe.getName());
        System.out.println("Nome da classe (simples): " + classe.getSimpleName());
        System.out.println("Nome canonical: " + classe.getResource(classe.getName()));


        System.out.println(("Tipo da classe: " + classe.getTypeName()));
        System.out.println("===============ATRIBUTOS DA CLASSE================");

        Field[] atributos = classe.getDeclaredFields();
        for (Field f : atributos) {
            System.out.println(f.getName() + " : " + f.getType().getTypeName());
        }
    }
}
