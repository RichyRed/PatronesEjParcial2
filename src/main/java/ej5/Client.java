package ej5;

public class Client {

    public static void main(String[] args){
        GitHub github= new GitHub();
        Git git= new Git();
        Repositorio upbGit = new Repositorio();


        upbGit.subscription(new UsuarioGit(
                new Persona("111111","Thanos")));
        upbGit.subscription(new UsuarioGit(
                new Persona("222222","Task Master")));
        upbGit.subscription(new UsuarioGit(
                new Persona("3333333","Venom")));

        Codigo codigo;
        codigo= new Codigo("public class","iniciado");
        git.setCommit(codigo);
        github.createCommit("Primero",git.createCommit());
        codigo= new Codigo("puclic abstract class","add class");
        git.setCommit(codigo);
        github.createCommit("Segundo",git.createCommit());
        codigo= new Codigo("Class Persona","add persona");
        git.setCommit(codigo);
        github.createCommit("Tercero",git.createCommit());
        codigo= new Codigo("Class Estudiante","add estudiante");
        git.setCommit(codigo);
        github.createCommit("Cuarto",git.createCommit());
        codigo= new Codigo("Class Documento","add documento");
        git.setCommit(codigo);
        github.createCommit("Quinto",git.createCommit());


        codigo = git.restoreCommit(github.getCommit("Primero"));
        upbGit.notifyObservers();
        System.out.println("--------- Mostrando cambios ----------");
        codigo.showInfo();


        upbGit.detach(0);
        upbGit.detach(1);


        upbGit.subscription(new UsuarioGit(
                new Persona("44444","Clint")));
        upbGit.subscription(new UsuarioGit(
                new Persona("555555","Steve")));
        upbGit.subscription(new UsuarioGit(
                new Persona("666666","Bucky")));

        upbGit.detach(0);

        codigo = git.restoreCommit(github.getCommit("Quinto"));
        upbGit.notifyObservers();
        System.out.println("------- MOstrando cambios --------------");
        codigo.showInfo();
    }
}
