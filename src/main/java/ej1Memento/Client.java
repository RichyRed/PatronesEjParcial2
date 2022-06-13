package ej1Memento;

public class Client {
    public static void main(String[] args){
        Correcciones ct = new Correcciones();
        Revisor r = new Revisor();

        Tesis tesis;

        tesis = new Tesis("Caratula", "No cumple estandares");
        r.setRevision(tesis);
        ct.createCorreccion("Primera Revision", r.createRevision());

        tesis = new Tesis(" Caratula \n Intro \n Objetivos",
                "No esta completo");
        r.setRevision(tesis);
        ct.createCorreccion("Seguna Revision", r.createRevision());

        tesis = new Tesis("Caratula \n Intro \n Objetivos \n Indice",
                "Completar de manera correcta el indice");
        r.setRevision(tesis);
        ct.createCorreccion("Tercera Revision", r.createRevision());

        tesis = new Tesis("Caratula \n Intro \n Objetivos " +
                "\n Indice \n Agradecimientos \n Desarrollo",
                "Ordenar ideas");
        r.setRevision(tesis);
        ct.createCorreccion("Cuarta Revision", r.createRevision());

        tesis = new Tesis("Caratula \n Intro \n Objetivos " +
                "\n Indice \n Agradecimientos \n Desarrollo \n Conclusion",
                "Falta acabar la tesis");
        r.setRevision(tesis);
        ct.createCorreccion("Quinta Revision", r.createRevision());

        tesis = r.restoreTesis(ct.getCorrecion("Tercera Revision"));
        tesis.showInfo();
    }
}
