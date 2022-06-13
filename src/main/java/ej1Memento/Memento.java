package ej1Memento;

public class Memento {
    private Tesis state;
    public Memento(Tesis tesis){
        state=tesis;
    }

    public Tesis getState() {
        return state;
    }
}
