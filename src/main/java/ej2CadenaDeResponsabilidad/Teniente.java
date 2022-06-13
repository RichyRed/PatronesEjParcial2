package ej2CadenaDeResponsabilidad;

public class Teniente implements IMando {

    private IMando next;

    @Override
    public void setNext(IMando handler) {
        next = handler;
    }

    @Override
    public void criteriaMando(String tarea) {
        if(tarea.equals("Disciplina")){
            System.out.println("Disciplinando a los soldados");
        }else{
            next.criteriaMando(tarea);
        }
    }

    @Override
    public IMando next() {
        return next;
    }
}
