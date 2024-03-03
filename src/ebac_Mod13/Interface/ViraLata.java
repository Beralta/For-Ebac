package ebac_Mod13.Interface;

public class ViraLata implements ICachorro{
    @Override
    public void morreu(String cachorro) {
        System.out.println(cachorro + " Morreu");
    }
    @Override
    public String Latir() {
        return "au au";
    }

    @Override
    public Integer Idade(int idade) {
        return idade;
    }

    @Override
    public boolean Nadar() {
        return true;
    }
}
