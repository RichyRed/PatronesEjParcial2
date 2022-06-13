package ej2CadenaDeResponsabilidad;

public interface IMando {
    void setNext(IMando handler);
    void criteriaMando(String tarea);
    IMando next();
}
