package ej2CadenaDeResponsabilidad;

public class CadenaMando implements IMando{
    private IMando next;

    @Override
    public void setNext(IMando handler) {
        next = handler;
    }

    @Override
    public void criteriaMando(String tarea) {
        General resp1 = new General();
        this.setNext(resp1);

        Teniente resp2 = new Teniente();
        resp1.setNext(resp2);

        Coronel resp3 = new Coronel();
        resp2.setNext(resp3);

        Cabo respFinal = new Cabo();
        resp3.setNext(respFinal);

        this.next.criteriaMando(tarea);

    }

    @Override
    public IMando next() {
        return next;
    }
}
