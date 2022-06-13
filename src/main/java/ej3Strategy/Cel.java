package ej3Strategy;

public class Cel {
    private String modelo;
    private String marca;
    private String gama;
    private int precio;

    public Cel(String modelo, String marca, String gama, int precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.gama = gama;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public Cel setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public Cel setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getGama() {
        return gama;
    }

    public Cel setGama(String gama) {
        this.gama = gama;
        return this;
    }

    public int getPrecio() {
        return precio;
    }

    public Cel setPrecio(int precio) {
        this.precio = precio;
        return this;
    }

    public void showInfo(){
        System.out.println("------ Informacion del cel -------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Gama: " + gama );
        System.out.println("Precio: " + precio + "Bs");
    }
}
