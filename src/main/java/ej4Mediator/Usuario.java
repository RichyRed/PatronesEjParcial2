package ej4Mediator;

import java.util.List;

public class Usuario extends Persona{



    public Usuario(IWhats canalComunicacion) {
        super(canalComunicacion);
    }

    @Override
    public void send(String msg, List<Integer>listaPersonas) {
        wasap.send(msg, this, listaPersonas);
    }

    @Override
    public void received(String msg) {
        System.out.println("Nombre: " + getNombre() + " Numero del usuario: " + getNumeroDeUsuario());
        System.out.println("Recibido: " + msg);

    }
}
