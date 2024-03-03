package ebac_Mod13.Interface;

import ebac_Mod13.Interface.ICachorro;

public class Program {
    public static void main(String[] args) {
        ViraLata cachorro = new ViraLata();
        cachorro.morreu("Bolt");
        System.out.println(cachorro.Idade(7));
        System.out.println(cachorro.Latir());


    }
}
