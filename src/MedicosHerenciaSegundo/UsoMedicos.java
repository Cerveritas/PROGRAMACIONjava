package MedicosHerenciaSegundo;

public class UsoMedicos {

    public static void main(String[] args) {

        Paciente paciente1 = new Paciente("Alejandro","Recarte",21,"Esta Muerto");
        Paciente paciente2 = new Paciente("Sergio","Cervera",20,"Esta Bueno");
        Paciente paciente3 = new Paciente("Nahiara","Zarco",19,"Belleza Explosiva");

        Paciente[] pacientes = {paciente1,paciente2,paciente3};


        Cirujano Superman = new Cirujano("Superman","SinCapa",1,"SuCasa",2,pacientes);


        System.out.println(Superman.showInfo());





    }
}
