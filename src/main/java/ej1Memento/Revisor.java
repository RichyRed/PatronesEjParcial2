package ej1Memento;

public class Revisor {
    private Tesis state;

    public void setRevision(Tesis state){
        this.state = state;
    }

    public Memento createRevision(){
        return new Memento(state);
    }

    public Tesis restoreTesis(Memento m){
        System.out.println();
        this.state=m.getState();
        return this.state;
    }

}
