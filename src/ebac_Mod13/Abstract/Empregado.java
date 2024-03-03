package ebac_Mod13.Abstract;

public abstract class Empregado {

    private String nome;
    private String sobrenome;
    private Integer cpf;

    Comissionado empregado = new Comissionado();


    public void imprimirsobrenome() {
        System.out.println("Seu sobrenme é " + this.sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }


    public abstract Double vencimento();

    public void  mostrarsobrenome(String sobrenome) {
        System.out.println("Meu sobrenome é " + sobrenome);
    }


}
