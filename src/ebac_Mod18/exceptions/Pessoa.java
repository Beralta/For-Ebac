package ebac_Mod18.exceptions;

public class Pessoa {
    public double valor;
    public double entrada;
    public int parcelas;

    public Pessoa(double valor, double entrada, int parcelas) {

        if(entrada < valor * 0.2) {
            throw new RuntimeException("A entrada deve ser no mínimo 20% do valor!");
        }
        else if(parcelas < 6) {
            throw  new RuntimeException("O número mínimo de parcelas é 6!");
        } else if (parcelas > 12) {
            throw  new RuntimeException("O número máximo de parcelas é 12!");

        }


        this.valor = valor;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public double prestacao() {
        System.out.print("Valor parcelado em " + parcelas + " parcelas de: ");
        double resultado = (valor - entrada) / parcelas;
        return (int) resultado;

    }
}
