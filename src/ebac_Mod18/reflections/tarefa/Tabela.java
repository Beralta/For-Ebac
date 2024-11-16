package ebac_Mod18.reflections.tarefa;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class Tabela {

    public static void main(String[] args) {

        var obj = new MyClass();
        new Processor().refletirNome(obj);
    }

}

class Processor {
    public void refletirNome(Object obj) {
        Field filds[] = obj.getClass().getDeclaredFields();

        for (Field field : filds) {
            if (field.isAnnotationPresent(Tabelinha.class)) {
                Tabelinha tabelinha = field.getAnnotation(Tabelinha.class);
                System.out.println("Campo " + field.getName() + ", Tabelinha: " + tabelinha.tabelinha());
            }
        }
    }
}
class MyClass {
    @Tabelinha(tabelinha = "preços")
    String tab;
}
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD})

@interface Tabelinha {
    String tabelinha();
}