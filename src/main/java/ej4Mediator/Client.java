package ej4Mediator;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[]args){
        Whats wasap = new Whats();
        List<Integer> l1 = Arrays.asList(2);
        List<Integer> l2 = Arrays.asList(1,2,3,4,5,6,7,8,9);


        Usuario u1 = new Usuario(wasap);
        u1.setNombre("Tony").setNumeroDeUsuario(1);
        Usuario u2 = new Usuario(wasap);
        u2.setNombre("Steve").setNumeroDeUsuario(2);
        Usuario u3 = new Usuario(wasap);
        u3.setNombre("Clint").setNumeroDeUsuario(3);
        Usuario u4 = new Usuario(wasap);
        u4.setNombre("Natasha").setNumeroDeUsuario(4);
        Usuario u5 = new Usuario(wasap);
        u5.setNombre("Bruce").setNumeroDeUsuario(5);
        Usuario u6 = new Usuario(wasap);
        u6.setNombre("Thor").setNumeroDeUsuario(6);
        Usuario u7 = new Usuario(wasap);
        u7.setNombre("Nick").setNumeroDeUsuario(7);
        Usuario u8 = new Usuario(wasap);
        u8.setNombre("Bucky").setNumeroDeUsuario(8);
        Usuario u9 = new Usuario(wasap);
        u9.setNombre("Carol").setNumeroDeUsuario(9);
        Usuario u10 = new Usuario(wasap);
        u10.setNombre("Drax").setNumeroDeUsuario(10);

        wasap.addUsuarios(u1).
                addUsuarios(u2).addUsuarios(u3).addUsuarios(u4).addUsuarios(u5).addUsuarios(u6).
                addUsuarios(u7).addUsuarios(u8).addUsuarios(u9).addUsuarios(u10);

        System.out.println("------ New Message -------");
        u1.send("Esto es para 2", l1);
        System.out.println("-------- New Message--------");
        u10.send("Esto es para todos", l2);
    }
}
