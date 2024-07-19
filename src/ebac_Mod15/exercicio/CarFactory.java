package ebac_Mod15.exercicio;

public class CarFactory {

    public Car getCar(String type) {
        if(type.equals("Economic")) {
            return new Economic(type);
        }
        if(type.equals("Vip")) {
            return new Vip(type);
        }
        return null;

    }
}
