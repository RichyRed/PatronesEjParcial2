package ej1Memento;

public class Tesis {

    private String contenido;

    private String comentariosTutor;

    public Tesis(String contenido, String comentariosTutor) {
        this.contenido = contenido;
        this.comentariosTutor = comentariosTutor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getComentariosTutor() {
        return comentariosTutor;
    }

    public void setComentariosTutor(String comentariosTutor) {
        this.comentariosTutor = comentariosTutor;
    }

    public void showInfo(){
        System.out.println("----- Contenido tesis ------");
        System.out.println(contenido);
        System.out.println("------ Comentario ---------");
        System.out.println(comentariosTutor);
    }
}
