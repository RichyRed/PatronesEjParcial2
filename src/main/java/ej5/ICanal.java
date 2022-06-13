package ej5;

public interface ICanal {
    void subscription(IUser observer);
    void detach(int posicion);
    void notifyObservers();
}
