package ExamenRecuperacionSegundoProfe;

public class Pasajero extends Persona{

    private TipoPasajero tipoPasajero;
    private TipoPasaje tipoPasaje;
    private int num_vuelos_reservados;

    public Pasajero(String dni, String nombre, String apellidos, String nacionalidad, String mail, String fecha_nacimiento, String tipoPasajero, String tipoPasaje, int num_vuelos_reservados) {
        super(dni, nombre, apellidos, nacionalidad, mail, fecha_nacimiento);
        this.tipoPasajero = TipoPasajero.valueOf(tipoPasajero);
        this.tipoPasaje = TipoPasaje.valueOf(tipoPasaje);
        this.num_vuelos_reservados = num_vuelos_reservados;
        this.n_puntos=calcularPuntos();
    }

    public  double calcularPuntos(){
        double valor_tipopasajero=0;
        double valor_tipopasaje=0;
     switch (tipoPasaje){
         case TURISTA : valor_tipopasaje=1;
                   break;
         case BUSINESS : valor_tipopasaje=3;
             break;
     }
        switch (tipoPasajero) {
            case SILVER: valor_tipopasajero=0.15;
                break;
            case GOLD : valor_tipopasaje=0.25;
                break;
            case PLATINUM: valor_tipopasaje=0.4;
                break;
        }
        return valor_tipopasaje*valor_tipopasajero*num_vuelos_reservados;


    }

    @Override
    public String toString() {
        return nombre+" "+ apellidos+ " "+ "pasajero con DNI "+ dni+ " y categoría " +tipoPasajero+".\n" ;
    }
}
