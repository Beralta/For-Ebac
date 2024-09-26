package ebac_Mod17.generic.exercice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        Carro Sedan = new Sedan();
        Carro Honda = new Honda();

        listaCarros.add(Sedan);
        listaCarros.add(Honda);

        for (Carro carros : listaCarros) {
            carros.ligarMotor();
        }
    }
}
