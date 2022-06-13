package ej6;

public class Empleado extends Usuario {
    private int nroUsuario;

    public Empleado(IMediator mediator) {
        super(mediator);
    }

    public int getNroUsuario() {
        return nroUsuario;
    }

    public void setNroUsuario(int nroUsuario) {
        this.nroUsuario = nroUsuario;
    }

    @Override
    public void send(String msg, String tipo, Empleado receiver) {
        mediator.send(msg, tipo, receiver, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Mensaje recibido por " + nroUsuario + " = " + msg);
    }
}
