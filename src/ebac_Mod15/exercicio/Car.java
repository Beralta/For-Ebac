package ebac_Mod15.exercicio;

import java.util.Objects;

public abstract class Car {
    public String type;
    public String relatory;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}

