package ej6;

public abstract class Usuario {
    protected IMediator mediator;

    public Usuario(IMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String msg, String tipo, Empleado receiver);
    public abstract void receive(String msg);
}
