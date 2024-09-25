package ebac_Mod17.generic;

public class GenericEmply<T> {

    private T data;

    public GenericEmply(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

}
