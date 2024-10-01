package ebac_Mod18.annotations;

@PrimeiraAnnotation(value = "Pedrin", bairros = {"laranjal", "Mutondo"}, numbers = {4, 5, 6}, nomes = "value", email = "Pedrin@gmail.com")
public class Annotations {

    @PrimeiraAnnotation(value = "Xubaca", bairros = {"Culubande", "tribobó"}, numbers = {1, 2}, nomes = "value", email = "Xubaca@gmail.com")
    private String name;
    private Number valorNumber;
}
