package ebac_Mod18.annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface PrimeiraAnnotation {
    String value();
    String[] bairros();
    int[] numbers();
    String nomes();
    String email();
}
