package ej7;

public class Client {
    public static void main(String[]args) {
        ClienteBanco cliente = new ClienteBanco("Tony Stark");
        Banco banco = new Banco();

        banco.criteriaHandler(cliente, 500);
        banco.criteriaHandler(cliente, 300);
        banco.criteriaHandler(cliente, 200);

        banco.criteriaHandler(cliente, 0);
    }
}
