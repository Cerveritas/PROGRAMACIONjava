package correcionExamenEj2Segundo;

public class Main {
    public static void main(String[] args) throws ExcepcionCuadrado {


        try {
            Cuadrado cuadrado1 = new Cuadrado(10);

            cuadrado1.dibujar();
            System.out.println("El area del cuadrado es " + cuadrado1.area());
            System.out.println("El volumen del cuadrado es " + cuadrado1.volumen());

            System.out.println(cuadrado1);


            /** EXCEPCIONES **/

            //  Cuadrado cuadrado10 = new Cuadrado(0);
            //  Cuadrado cuadrado11 = new Cuadrado(-2);


            /**********************************************************************************************/

            // ahora vamos a hacerlo creando un array de 3 cuadrados y que lo vaya recorriendo
            // y de esta manera va imprimiendo todos los metodos

            Cuadrado cuadrado20 = new Cuadrado(3);
            Cuadrado cuadrado21 = new Cuadrado(8);
            Cuadrado cuadrado22 = new Cuadrado(15);

            Cuadrado[] lista_cuadrado = {cuadrado20, cuadrado21, cuadrado22};

            for (int i = 0; i < lista_cuadrado.length; i++) {
                System.out.println("El cuadrado " + i + " tiene un \n" +
                        "area de " + lista_cuadrado[i].area() + " \n" +
                        "y volumen de " + lista_cuadrado[i].volumen() + "\n" +
                        "con dibujo: " + lista_cuadrado[i].dibujar());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
