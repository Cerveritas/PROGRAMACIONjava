package ExamenRecuperacionSegundoProfe;

public class Tripulacion extends Persona{

    private Categoria categoria;
    private int n_experiencia;
    private double salario;
    private int num_vuelos_tripulados;

    public Tripulacion(String dni, String nombre, String apellidos, String nacionalidad, String mail, String fecha_nacimiento, String categoria, int n_experiencia, int num_vuelos_tripulados) {
        super(dni, nombre, apellidos, nacionalidad, mail, fecha_nacimiento);
        this.categoria = Categoria.valueOf(categoria.toUpperCase());
        this.n_experiencia = n_experiencia;
        this.num_vuelos_tripulados = num_vuelos_tripulados;
        this.salario=calcularsalalario();
        this.n_puntos=calcularPuntos();
    }

    private double calcularsalalario(){
        double resultado=0;
        switch (categoria){
            case PILOTO : resultado= 50000+120*n_experiencia;break;
            case AZAFATO: resultado= 18000+65*n_experiencia;break;
        }
        return resultado;
    }

    public  double calcularPuntos(){
        double resultado=0;
        switch (categoria){
            case PILOTO : resultado= 5*num_vuelos_tripulados;break;
            case AZAFATO: resultado= 2.5*num_vuelos_tripulados;break;
        }

        return resultado;
    }

    @Override
    public String toString() {
        return nombre+" "+ apellidos+ " "+ " tripulante con DNI "+ dni+ ",categoría " + categoria+" y "+n_experiencia+" años de experiencia " +
                "en vuelo."+"\n" ;
    }
}
