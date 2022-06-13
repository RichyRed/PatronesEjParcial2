package ej7;

public class AgenteCreditos implements IBanco {
    private IBanco next;

    @Override
    public void setNext(IBanco handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(ClienteBanco clienteBanco, int cantidad) {
        int saldoActual = Prestamo.getInstance().getPrestamo() - Prestamo.getInstance().getSaldo();
        if((saldoActual > Prestamo.getInstance().getPrestamo()*0.25) && (saldoActual < Prestamo.getInstance().getPrestamo()*0.5)){
            clienteBanco.pagarPrestamoCliente(cantidad);
            System.out.println("El agente recibio " + cantidad + " Bs del prestamo, y desea reiniciar el prestamo");
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
