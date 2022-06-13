package ej6;

public class Client {
    public static void main(String[] args){
        Chat mediator = new Chat();
        Empleado empleado1 = new Empleado(mediator);
        empleado1.setNroUsuario(1);

        Empleado empleado2 = new Empleado(mediator);
        empleado2.setNroUsuario(2);

        Empleado empleado3 = new Empleado(mediator);
        empleado3.setNroUsuario(3);

        Empleado empleado4 = new Empleado(mediator);
        empleado4.setNroUsuario(4);

        mediator.addChat(empleado1);
        mediator.addChat(empleado2);
        mediator.addChat(empleado3);
        mediator.addChat(empleado4);

        empleado1.send("Realizando backup de tu trabajo, empleado 2!", "Dm", empleado2);
        empleado4.send("Mensaje para todos, trabajeeen", "Grupal", null);
    }
}
