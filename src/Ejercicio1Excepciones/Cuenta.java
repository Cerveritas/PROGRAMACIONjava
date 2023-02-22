package Ejercicio1Excepciones;

public class Cuenta {

    private String titular;
    private int numeroCuenta;
    private double cantidad;

    public Cuenta(){
    }

    public Cuenta(String titular, int numeroCuenta, double cantidad) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.cantidad = cantidad;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }


    @Override
    public String toString() {
        return "La cuenta con numero "+numeroCuenta+
                "tiene como titular a "+titular+
                "con un saldo disponible de "+cantidad;
    }

    public void ingresar(double cantidadIngre) throws CantidadIncorrecta{
       if (cantidadIngre < 0){
           throw new CantidadIncorrecta("No se puede ingresar esa cantidad");
       }
       cantidad = cantidad + cantidadIngre;
    }

    public void retirar(double cantidadReti) throws CantidadIncorrecta{
        if (cantidad < cantidadReti){
            throw new CantidadIncorrecta("No tienes saldo sufciente en cuenta");
        }
        cantidad = cantidad - cantidadReti;
    }
}
