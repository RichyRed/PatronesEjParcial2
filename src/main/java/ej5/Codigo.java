package ej5;

public class Codigo {
    private String liniasCodigo;
    private String comments;

    public Codigo(String liniasCodigo, String comments){
        this.liniasCodigo=liniasCodigo;
        this.comments=comments;
    }

    public String getLiniasCodigo() {
        return liniasCodigo;
    }

    public void setLiniasCodigo(String liniasCodigo) {
        this.liniasCodigo = liniasCodigo;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void showInfo() {
        System.out.println("Lineas de codigo: "+liniasCodigo);
        System.out.println("Comments: "+comments);

    }
}
