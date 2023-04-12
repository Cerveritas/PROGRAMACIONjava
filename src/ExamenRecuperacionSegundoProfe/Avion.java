package ExamenRecuperacionSegundoProfe;

public class Avion implements IAccionAeropuerto{
    private static int CONTADOR=0;
    private int id;
    private String modelo;
    private double peso;
    private double altura;
    private double ancho;
    private int anyo_fabricacion;
    private String nombre_fabricante;
    private String Compania_aerea;
    private int num_asientos;
    private TipoAvion tipo;
    private Estado estado_vuelo;

    public Avion(String modelo, double peso, double altura, double ancho, int anyo_fabricacion,String nombre_fabricante, String compania_aerea, int num_asientos, String tipo) throws ValorIncorrecto {
        this.id= CONTADOR++;
        this.modelo = modelo;
        if (peso<=0|| altura<=0 || ancho<=0){
            throw new ValorIncorrecto("no se puede introducir valores incorrectos");
        }
        this.peso = peso;
        this.altura = altura;
        this.ancho = ancho;
        this.anyo_fabricacion = anyo_fabricacion;
        this.nombre_fabricante=nombre_fabricante.toUpperCase();
        this.Compania_aerea = compania_aerea.toUpperCase();
        this.num_asientos = num_asientos;
        if (TipoAvion.CARGA.toString().equals(tipo.toUpperCase()) ||TipoAvion.COMERCIAL.toString().equals(tipo.toUpperCase()) || TipoAvion.MILITAR.toString().equals(tipo.toUpperCase())){
            this.tipo = TipoAvion.valueOf(tipo.toUpperCase());
        }
        else {
            throw new IllegalArgumentException("no existe un valor enumerado con ese valor");
        }

        this.estado_vuelo = Estado.APAGADO;
    }

    @Override
    public void aterrizar() throws AccionInvalida {
      if (estado_vuelo.equals(Estado.ATERRIZANDO)){
          throw new AccionInvalida("no se puede aterrizar ya habiendo empezado maniobras de aterrizajeno se puede aterrizar ya habiendo empezado maniobras de aterrizaje ");
      }
      estado_vuelo=Estado.ATERRIZANDO;

    }

    @Override
    public void despegar() throws AccionInvalida {
        if (estado_vuelo.equals(Estado.ATERRIZANDO)){
            throw new AccionInvalida("no se puede despegar ya habiendo empezado maniobras de despegue ");
        }
        estado_vuelo=Estado.ATERRIZANDO;

    }

    public int getId() {
        return id;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws ValorIncorrecto {
        if (peso<=0){
            throw new ValorIncorrecto("no se puede introducir valores incorrectos");
        }
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws ValorIncorrecto {
        if ( altura<=0){
            throw new ValorIncorrecto("no se puede introducir valores incorrectos");
        }
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) throws ValorIncorrecto {
        if ( ancho<=0){
            throw new ValorIncorrecto("no se puede introducir valores incorrectos");
        }
        this.ancho = ancho;
    }

    public int getAnyo_fabricacion() {
        return anyo_fabricacion;
    }

    public void setAnyo_fabricacion(int anyo_fabricacion) {
        this.anyo_fabricacion = anyo_fabricacion;
    }

    public String getCompania_aerea() {
        return Compania_aerea;
    }

    public void setCompania_aerea(String compania_aerea) {
        Compania_aerea = compania_aerea.toUpperCase();
    }

    public String getNombre_fabricante() {
        return nombre_fabricante;
    }

    public void setNombre_fabricante(String nombre_fabricante) {
        this.nombre_fabricante = nombre_fabricante.toUpperCase();
    }

    public int getNum_asientos() {
        return num_asientos;
    }

    public void setNum_asientos(int num_asientos) {
        this.num_asientos = num_asientos;
    }

    public TipoAvion getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws IllegalArgumentException  {
        if (!TipoAvion.CARGA.toString().equals(tipo) || !TipoAvion.COMERCIAL.toString().equals(tipo)||!TipoAvion.MILITAR.toString().equals(tipo)){
            throw new IllegalArgumentException("no existe un valor enumerado con ese valor");
        }
        this.tipo = TipoAvion.valueOf(tipo.toUpperCase());
    }

    public Estado getEstado_vuelo() {
        return estado_vuelo;
    }

    public void setEstado_vuelo(Estado estado_vuelo) throws IllegalArgumentException {
        if (!Estado.ATERRIZANDO.toString().equals(estado_vuelo) || !Estado.DESPEGANDO.toString().equals(estado_vuelo) || !Estado.EN_VUELO.toString().equals(estado_vuelo)){
            throw new IllegalArgumentException("no existe un valor enumerado con ese valor");
        }
        this.estado_vuelo = estado_vuelo;
    }
}
