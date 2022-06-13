package ej5;

public class UsuarioGit implements IUser {

    Persona persona;

    public UsuarioGit(Persona persona) {
        this.persona = persona;
    }

    @Override
    public void update(String msg) {
        System.out.println("-------Notificacion: "+msg+" -------");
        System.out.println("Persona: "+persona.getName());
    }

    public Persona getPersona() {
        return persona;
    }


}
