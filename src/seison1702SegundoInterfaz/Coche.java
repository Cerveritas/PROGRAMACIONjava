package seison1702SegundoInterfaz;

public class Coche extends Vehiculo implements IPito,IVolante{




    private String marca;
    private String color;

    public Coche(){

    }

    public Coche(int puertas, int caballos, String marca, String color) {
        super(puertas, caballos);
        this.marca = marca;
        this.color = color;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




    @Override
    public void girar() {
        System.out.println("Girando");
    }

    @Override
    public void pitar() {
        System.out.println("Piiiiiiiiiiii");
    }



}
