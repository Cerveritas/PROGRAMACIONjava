package EjerciciosMetodos;


import java.util.Scanner;


public class Ejercicio6 {
    public Scanner sc;

    public static void main(String[] args) {

        int opcion = 0;
        int[] numeros = new int[9];
    do {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("(1) - Generar un array");
        System.out.println("(2) - Valor minimo del array");
        System.out.println("(3) - Valor maximo del array");
        System.out.println("(4) - Media del array");
        System.out.println("(5) - Ver si un numero esta en el array o no");
        System.out.println("(6) - Ver en que posicion se encuentra un numero");
        System.out.println("(7) - Copiar el array en otro array");
                                                                                                                        System.out.println(" ");
        System.out.println("Que es lo que quieres hacer: ");
        opcion = sc.nextInt();



        switch (opcion) {
            case 0: salirPrograma();
                break;

            case 1:
                numeros = generarArray(numeros);
                System.out.println("Array creado correctamente...");
                break;

            case 2:System.out.println("El numero minimo es "+devolverMinimo(numeros));
                break;

            case 3: System.out.println("El numero mas grande del Array es: "+devolverMaximo(numeros));
                break;

            case 4:System.out.println("La media de los numeros del array es: "+devolverMedia(numeros));
                break;

            case 5:
                if(verSiNumeroEsta(numeros) == true){
                    System.out.println("EL numero esta");
                }else {System.out.println("EL numero no esta");}
                break;

           //case 6:System.out.println("loco "+devolverPosicion(numeros));

              // devolverPosicion(numeros);



              //  ;break;

            //case 7:numeros=copiarArray(numeros);break;

            default:
                System.out.println("El numero introducido no es correcto.");
                break;

        }
    } while (opcion != 0) ;


    }

    // METODO 0 --> Este metodo no devuelve nada, su eso es para salir del programa
    public static void salirPrograma(){
        System.out.println("Saliendo del programa...");
    }

    // METODO 1 --> Genera un array
    public static int[] generarArray(int[] numeros){
        numeros=new int[9];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<9; i++){
            System.out.println("Introduce el numero de la posicion "+i);
            numeros[i]= sc.nextInt();
        }
        return numeros;

    }


    // METODO 2 --> Devuelve el valor minimo del Array
    public static int devolverMinimo(int[]numeros){
        int menor=0;
        menor = numeros[0];
        for(int i = 0; i<9; i++){
            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }
        return menor;
    }

    // METODO 3 --> Devuelve el valor maximo del Array
    public static int devolverMaximo(int[]numeros){
        int mayor = 0;
        mayor=numeros[0];
        for(int i=0; i<9; i++){
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    // METODO 4 --> Devuelve la media de todos los numeros del Array
    public static int devolverMedia(int[]numeros){
        return (numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4]+numeros[5]+numeros[6]+numeros[7]+numeros[8])/9;

    }

    // METODO 5 --> Ver si el numero introducido por pantalla se encuentra en el Array o no
    public static boolean verSiNumeroEsta(int[]numeros) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        num = sc.nextInt();

        for(int i=0; i<9; i++){
            if(numeros[i] == num){
                return true;
            }
        }
        return false;



    }



    // METODO 6 --> Devuelve la posicion en el Array el numero metido por teclado
  /*  public static int devolverPosicion(int[]numeros) {
        int posicion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres buscar: ");
        posicion = sc.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros.equals(posicion)) {

            }
        }


            return posicion;
    }

  /*  public static int[] copiarArray(int[]numeros){

    }*/


}
