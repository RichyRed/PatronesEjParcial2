package ej7;

public class ClienteBanco {
    private String cliente;

    public ClienteBanco(String cliente) {
        this.cliente = cliente;
    }

    public void pagarPrestamoCliente(int cantidad){
        Prestamo.getInstance().pagarPrestamo(cantidad);
    }
}
