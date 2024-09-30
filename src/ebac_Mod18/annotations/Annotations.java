package ebac_Mod18.annotations;

@PrimeiraAnnotation(value = "Pedrin", bairros = {"laranjal", "Mutondo"}, numbers = {4, 5, 6}, nomes = "value")
public class Annotations {

    @PrimeiraAnnotation(value = "Xubaca", bairros = {"Culubande", "tribobó"}, numbers = {1, 2}, nomes = "value")
    private String name;
    private Number valorNumber;
}
