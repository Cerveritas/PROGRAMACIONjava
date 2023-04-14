package ExamenRecuperacionSegundo2;

import java.util.Random;

public class Password {


    /** CONSTANTES */

    private final static int LONGITUD_DEFECTO = 8;


    /** ATRIBUTOS */
    private int longitud = LONGITUD_DEFECTO;
    private String contraseña;


    /** CONSTRUCTORES */

    // por defecto
    public Password() {
    }

    // parametrizado
    public Password(int longitud) throws longitudIncorrecta {
        if (longitud < LONGITUD_DEFECTO){
            throw new longitudIncorrecta("Se necesita una contraseña con longitud minima de 8");
        }
        this.longitud = longitud;
        this.contraseña = generarPassword();

    }


    /** GETTERS AND SETTERS */

    // getters
    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }


    // setters

    public void setLongitud(int longitud) throws longitudIncorrecta, contraseñaInvalida {
        if (longitud < LONGITUD_DEFECTO){
            throw new longitudIncorrecta("Se necesita una contraseña con longitud minima de 8");
        }
        this.longitud = longitud;
        this.contraseña = generarPassword();

    }


    /** METODOS */

    public String generarPassword() {
        String password_generada = null;

        for (int i = 0; i < longitud; i++) {
            int eleccion = (int) Math.floor(Math.random() * 3 + 1);

            if (eleccion == 1){
                // minusculas
                char minuscula = (char) Math.floor(Math.random()*(123 - 97)+97);
                password_generada = password_generada + minuscula;

            } else {
                if (eleccion == 2){
                    // mayusculas
                    char mayuscula = (char) Math.floor(Math.random()*(91 - 65)+65);
                    password_generada = password_generada +mayuscula;

                } else {
                    // 3 numeros
                    char numero = (char) Math.floor(Math.random()*(58 - 48)+48);
                    password_generada = password_generada + numero;
                }
            }
        }
        return password_generada;
    }



    public boolean esFuerte(){
        boolean resultado = false;
        int cuentaNumeros = 0;
        int cuentaMayusculas = 0;
        int cuentaMinusculas = 0;

        for (int i = 0; i<contraseña.length(); i++){
            if (contraseña.charAt(i) >= 97 || contraseña.charAt(i) <= 122){
                cuentaMinusculas++;
            } else {
                if (contraseña.charAt(i) >= 65 || contraseña.charAt(i) <= 90) {
                    cuentaMayusculas++;
                } else {
                    cuentaNumeros++;
                }
            }

        }
        if (cuentaNumeros >= 5 || cuentaMinusculas >= 1 || cuentaMayusculas >= 2){
            resultado = true;
        }
        return  resultado;
    }
}
