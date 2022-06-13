package ej7;

public class Banco implements IBanco {
    private IBanco next;

    @Override
    public void setNext(IBanco handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(ClienteBanco clienteBanco, int cantidad) {
        Cajero resp1 = new Cajero();
        this.setNext(resp1);

        AgenteCreditos resp2 = new AgenteCreditos();
        resp1.setNext(resp2);

        Supervisor resp3 = new Supervisor();
        resp2.setNext(resp3);

        Encargado respFinal = new Encargado();
        resp3.setNext(respFinal);

        this.next.criteriaHandler(clienteBanco, cantidad);
    }

    @Override
    public IBanco next() {
        return next;
    }
}
