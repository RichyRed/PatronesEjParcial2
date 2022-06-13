package ej6;

public interface IMediator {
    void send(String msg, String tipo, Empleado receiver, Empleado sender);
}
