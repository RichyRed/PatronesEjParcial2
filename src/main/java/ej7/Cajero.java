package ej7;

public class Cajero implements IBanco {
    private IBanco next;

    @Override
    public void setNext(IBanco handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(ClienteBanco clienteBanco, int cantidad) {
        int saldoActual = Prestamo.getInstance().getPrestamo() - Prestamo.getInstance().getSaldo();
        if(saldoActual < Prestamo.getInstance().getPrestamo()*0.25){
            clienteBanco.pagarPrestamoCliente(cantidad);
            System.out.println("El cajero recibio " + cantidad + " Bs del prestamo");
            System.out.println();
        } else {
            next.criteriaHandler(clienteBanco, cantidad);
        }
    }

    @Override
    public IBanco next() {
        return next;
    }
}
