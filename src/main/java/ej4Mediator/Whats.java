package ej4Mediator;

import java.util.ArrayList;
import java.util.List;

public class Whats implements IWhats {

    List<Usuario> personasEnWap = new ArrayList<>();

    public Whats addUsuarios(Usuario usuario){
        personasEnWap.add(usuario);
        return this;
    }

    @Override
    public void send(String msg, Persona persona, List<Integer> listaPersonas) {
        Usuario emisor = (Usuario) persona;
        for(Integer numeroP:listaPersonas){
            for(Usuario usuario:personasEnWap){
                if(numeroP != emisor.getNumeroDeUsuario()) {
                    if (numeroP == usuario.getNumeroDeUsuario()) {
                        usuario.received(msg);
                    }
                }
            }
        }
    }
}
