package ExamenRecuperacionSegundoProfe;

public class Vuelo {
    private String num_vuelo;
    private Aeropuerto aeropuerto_origen;
    private Aeropuerto aeropuerto_destino;
    private Avion avion;
    private Tripulacion[] tripulacion;
    private Pasajero[] pasajero;

    public Vuelo(Aeropuerto aeropuerto_origen, Aeropuerto aeropuerto_destino, Avion avion, Tripulacion[] tripulacion, Pasajero[] pasajero) {
        this.num_vuelo=generarNumVuelo();
        this.aeropuerto_origen = aeropuerto_origen;
        this.aeropuerto_destino = aeropuerto_destino;
        this.avion = avion;
        this.tripulacion = tripulacion;
        this.pasajero = pasajero;
    }

    private String generarNumVuelo() {
       String resultado="";
       for (int i=0;i<2;i++){

               int numero = (int)(Math.random()*(57-48+1)+57);
                       resultado+=numero;

       }
      for (int j=0;j<2;j++){
            char letra= (char) (int) (Math.random()*(90-65+1)+65);
            resultado+=letra;
        }

       return resultado;
    }

    @Override
    public String toString() {
        return "El vuelo "+ num_vuelo+" con origen aeropuerto "+aeropuerto_origen.getNombre()+"-"
                +aeropuerto_origen.getPais()+" y destino "+aeropuerto_destino.getNombre()+"-"+
                aeropuerto_destino.getPais()+ " tiene "+ pasajero.length+" pasajeros "+
                "y "+tripulacion.length+" miembros de tripulación.\n"+"" +
                "A continuación el listado de todos ellos:\n"+
                imprimir_datos_tripulacion()+
                imprimir_datos_pasajeros();
    }

    private String imprimir_datos_pasajeros() {
        String resultado="";
        for (int i=0;i< pasajero.length;i++){
            resultado+=pasajero[i].toString();
        }
        return resultado;

    }
    private String imprimir_datos_tripulacion() {
        String resultado="";
        for (int i=0;i< tripulacion.length;i++){
            resultado+=tripulacion[i].toString();
        }
        return resultado;

    }

}
