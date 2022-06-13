package ej2CadenaDeResponsabilidad;

public class General implements IMando {

    private IMando next;

    @Override
    public void setNext(IMando handler) {
        next = handler;
    }

    @Override
    public void criteriaMando(String tarea) {
        if(tarea.equals("Entrevistas")){
            System.out.println("Realizando las antrevistas");
        }else{
            next.criteriaMando(tarea);
        }
    }

    @Override
    public IMando next() {
        return next;
    }
}
