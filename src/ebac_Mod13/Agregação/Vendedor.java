package ebac_Mod13.Agregação;

public class Vendedor {

    private String nome;

    private Double comissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public void vende() {
        System.out.println("Vender");
    }
}
