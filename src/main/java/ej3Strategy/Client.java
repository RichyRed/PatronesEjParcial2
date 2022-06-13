package ej3Strategy;

public class Client {
    public static void main(String []args){
        TiendaCels tiendaCelulares = new TiendaCels("Mi celu");

        tiendaCelulares.addCelular(new Cel("Note","Samsung", "Alta", 800));
        tiendaCelulares.addCelular(new Cel("S 7","Samsung", "BAja", 200));
        tiendaCelulares.addCelular(new Cel("Iphone","Apple", "Alta", 600));
        tiendaCelulares.addCelular(new Cel("Iphone 13","Apple", "Superior", 450));
        tiendaCelulares.addCelular(new Cel("El que se dobla","Samsung", "Alta", 500));
        tiendaCelulares.addCelular(new Cel("A5","Samsung", "Media", 400));

        tiendaCelulares.setEstrategiaBusqeuda(new AlgoritmoDosMin("A5", 400));
        tiendaCelulares.iniciarAlgoritmo();

    }
}
