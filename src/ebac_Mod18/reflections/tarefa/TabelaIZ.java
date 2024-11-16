package ebac_Mod18.reflections.tarefa;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class TabelaIZ {

    public static void main(String[] args) {
        for (Field field : MyClas.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(Tabel.class)) {
                System.out.println(field.getAnnotation(Tabel.class).tabe());
            }
        }
    }
}

class MyClas {
    @Tabel(tabe = "preços")
    String exp;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Tabel {
    String tabe();
}
