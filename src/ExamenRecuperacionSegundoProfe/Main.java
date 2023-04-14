package ExamenRecuperacionSegundoProfe;

public class Main {
    public static void main(String[] args) throws ValorIncorrecto {

        //2 pilotos
        Tripulacion piloto1= new Tripulacion("12345678X","José","Bermejo","Francés","jose.bermejo@gmail.com","28-05-1963","PILOTO",5,500);
        Tripulacion piloto2= new Tripulacion("12345678T","José","Aguilar","Español","jose.aguilar@gmail.com","01-05-1963","PILOTO",2,200);

        //3 azafatos

        Tripulacion azafato1= new Tripulacion("12345678X","Capi","Herrera","Inglés","capi.herrera@gmail.com","28-05-1963","AZAFATO",5,500);
        Tripulacion azafato2= new Tripulacion("12345678T","Juliana","Sanz","Alemán","juliana.sanz@gmail.com","01-05-1963","AZAFATO",2,200);
        Tripulacion azafato3= new Tripulacion("12345678T","Emilia","Cabello","Español","emilia.cabello@gmail.com","01-05-1963","AZAFATO",2,200);

        Tripulacion[] tripulacion = {piloto1,piloto2,azafato1,azafato2,azafato3};


        // 5 pasajeros

        Pasajero pasajero1= new Pasajero("12345678X","Pia","Ortega","Francesa","pia.ortega@gmail.com","23-09-2023","GOLD","BUSINESS",5);
        Pasajero pasajero2= new Pasajero("12345678X","Ballesteros","Borreguero","Francesa","ballesteros.borreguero@gmail.com","23-09-2023","GOLD","BUSINESS",5);

        //avion

        Avion avion1 = new Avion("boeing 575",50000,5,8,2001,"Airbus","Iberia",2,"comercial");
        Pasajero[] pasaje= new Pasajero[avion1.getNum_asientos()];
        pasaje[0]=pasajero1;
        pasaje[1]=pasajero2;



        //Aerpuerto origen
        Aeropuerto aeropuertoOrigen = new Aeropuerto("Barajas","España","Madrid",25000000,4);


        //aeropuerto destino
        Aeropuerto aeropuertoDestino = new Aeropuerto("Charles de Gaulle","France","ile de france",50000000,3);


        //vuelo
        Vuelo vuelo1 = new Vuelo(aeropuertoOrigen,aeropuertoDestino,avion1,tripulacion,pasaje);
        System.out.println(vuelo1.toString());
    }
}