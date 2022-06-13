package ej7;

public class Supervisor implements IBanco {
    private IBanco next;

    @Override
    public void setNext(IBanco handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(ClienteBanco clienteBanco, int cantidad) {
        int saldoActual = Prestamo.getInstance().getPrestamo() - Prestamo.getInstance().getSaldo();
        if((saldoActual > Prestamo.getInstance().getPrestamo()*0.49) && (saldoActual < Prestamo.getInstance().getPrestamo())){
            clienteBanco.pagarPrestamoCliente(cantidad);
            System.out.println("El supervisor recibio " + cantidad + " Bs del prestamo antiguo, y ofrece un nuevo prestamo");
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
