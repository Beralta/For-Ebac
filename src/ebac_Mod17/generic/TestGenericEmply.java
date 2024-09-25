package ebac_Mod17.generic;

public class TestGenericEmply {

    public static void main(String[] args) {

        GenericEmply<String> Generic = new GenericEmply<>("Qualquer");
        System.out.println(Generic.getData());
    }

}
