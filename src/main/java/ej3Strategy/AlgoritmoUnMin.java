package ej3Strategy;

import java.util.List;

public class AlgoritmoUnMin implements IBusqueda{

    private int precioEntrada;

    public AlgoritmoUnMin(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public void estrategiaDeBusqueda(List<Cel> inventario) {
        if(inventario.size() <= 10) {
            for (int i = 0; i < inventario.size(); i++) {
                if(inventario.get(i).getPrecio() == precioEntrada){
                    inventario.get(i).showInfo();
                }
            }
        }else{
            System.out.println("Este arreglo esta grande, utilizar otro");
        }
    }
}
