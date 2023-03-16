package correccionExamenEj1Segundo;

public class Main {
    public static void main(String[] args) {

        // crear un array de 5 posiciones de Electrodomesticos

        Electrodomestico[] listado_electrodomesticos = new Electrodomestico[5];

        // o bien lavadoras o bien televisores

        Television tele1 = new Television(200, 5, 50, true);
        Television tele2 = new Television(35, 25, 50, true);
        Television tele3 = new Television(15, 60, 50, true);

        Lavadora lava1 = new Lavadora(55, 60, 35);
        Lavadora lava2 = new Lavadora(300, 85, 50);


        listado_electrodomesticos[0] = tele1;
        listado_electrodomesticos[1] = tele2;
        listado_electrodomesticos[2] = tele3;
        listado_electrodomesticos[3] = lava1;
        listado_electrodomesticos[4] = lava2;


        float precio_televisiones = 0;
        float precio_lavadoras = 0;
        float precio_total = 0;

        for (int i = 0; i < listado_electrodomesticos.length; i++){
            System.out.println("El primer electrodomestico "+listado_electrodomesticos[i].getClass().getSimpleName()+"\n" +
                                "tiene un precio final de "+listado_electrodomesticos[i].getPrecio_final()+"€");
                                                                                                                        System.out.println(" ");

            if (listado_electrodomesticos[i] instanceof Lavadora){
                precio_lavadoras += listado_electrodomesticos[i].precio_final;
            } else if (listado_electrodomesticos[i] instanceof Television) {
                precio_televisiones += listado_electrodomesticos[i].getPrecio_final();
            }
            precio_total = precio_lavadoras + precio_televisiones;
        }
        System.out.println("El precio final de todas las lavadoras es "+precio_lavadoras);
        System.out.println("El precio final de todas las televisiones es "+precio_televisiones);
        System.out.println("El precio total es de "+precio_total);













    }
}
