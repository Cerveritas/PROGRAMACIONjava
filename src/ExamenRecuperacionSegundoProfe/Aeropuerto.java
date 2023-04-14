package ExamenRecuperacionSegundoProfe;

public final class Aeropuerto {
    private final static double GASTO_USUARIO=6.25;
    private String nombre;
    private String pais;
    private String provincia;
    private double beneficios_anuales;
    private int num_viajeros;
    private int n_terminales;

    public Aeropuerto(String nombre, String pais, String provincia, int num_viajeros, int n_terminales) {
        this.nombre = nombre;
        this.pais = pais;
        this.provincia = provincia;
        this.num_viajeros = num_viajeros;
        this.n_terminales = n_terminales;
        this.beneficios_anuales=obtenerganancia();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getBeneficios_anuales() {
        return beneficios_anuales;
    }



    public int getNum_viajeros() {
        return num_viajeros;
    }

    public void setNum_viajeros(int num_viajeros) {
        this.num_viajeros = num_viajeros;
        this.beneficios_anuales=obtenerganancia();
    }

    public int getN_terminales() {
        return n_terminales;
    }

    public void setN_terminales(int n_terminales) {
        this.n_terminales = n_terminales;
        this.beneficios_anuales=obtenerganancia();
    }

    public double obtenerganancia(){

        return num_viajeros*n_terminales*GASTO_USUARIO;
    }




}
