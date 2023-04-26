
package SimulacroExamenTercero.Personas;

public class Main {
    public static void main(String[] args) {

        Mujer m1 = new Mujer("12345678X0", "Sofia", "Bermejo", 38, 1.60, 100, false);
        Mujer m2 = new Mujer("12345635G0", "Nahiara", "Zarco", 20, 1.72, 60, false);

        Hombre h1 = new Hombre("3243244F", "Sergio", "Cervera", 20, 1.80, 10, true);
        Hombre h2 = new Hombre("3243443F", "Alejandro", "Recarte", 50, 1.50, 30, false);

        Filtrados.add(m1);
        Filtrados.add(m2);
        Filtrados.add(h1);
        Filtrados.add(h2);

                                                                                                                        System.out.println(" ");
        System.out.println("IMPRIMIR LAS PERSONAS INSERTADAS EN LISTA");
        Filtrados.printArray(Filtrados.lista);
                                                                                                                        System.out.println(" ");
        System.out.println("IMPRIMIR DE MAYOR A MENOR ICM");
        Filtrados.orderByLowerToLowerICM();
                                                                                                                        System.out.println(" ");
        System.out.println("IMPRIMIR DE MENOR A MAYOR ICM");
        Filtrados.orderByLowerToHigherICM();
                                                                                                                        System.out.println(" ");
        System.out.println("FILTRAR LOS CHICOS CON ICM MENOR A 25");
        Filtrados.printArray(Filtrados.filteredbyICMLower(25, 'c'));











    }
}
