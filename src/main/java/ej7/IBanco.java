package ej7;

public interface IBanco {
    void setNext(IBanco handler);
    void criteriaHandler(ClienteBanco clienteBanco, int cantidad);
    IBanco next();
}
