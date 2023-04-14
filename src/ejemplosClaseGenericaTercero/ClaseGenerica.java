package ejemplosClaseGenericaTercero;

public class ClaseGenerica<T> {


    // variable de tipo T
    private T midato;

    // metodo constructor
    public ClaseGenerica(){
        midato = null;
    }

    // metodo setter
    public void setClaseGenerica(T midato) {
        this.midato = midato;
    }

    // metodo que devuelve el dato (getter)
    public T getClaseGenerica() {
        return midato;
    }
}
