package ej7;

public class Prestamo {
    private static Prestamo instance;
    private int prestamo;
    private int saldo;

    private Prestamo(){
        prestamo = 1000;
        saldo = prestamo;
    }

    private synchronized static void  multiThreadControl(){
        if (instance == null){
            instance = new Prestamo();
        }
    }

    public static Prestamo getInstance(){
        if (instance == null)
            multiThreadControl();
        return instance;
    }

    public static void setInstance(Prestamo instance) {
        Prestamo.instance = instance;
    }

    public int getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(int prestamo) {
        this.prestamo = prestamo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public synchronized void pagarPrestamo(int cantidad){
        if(saldo >= cantidad){
            saldo = saldo - cantidad;
            System.out.println("Pagando el prestamo .-" + cantidad);
            System.out.println("Saldo .- " + saldo);
        }
    }
}
