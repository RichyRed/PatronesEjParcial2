package ej3Strategy;

import java.util.List;

public class AlgoritmoDosMax implements IBusqueda{

    private String modeloEntrada;
    private int precioEntrada;

    public AlgoritmoDosMax(String modeloEntrada, int precioEntrada) {

        this.modeloEntrada = modeloEntrada;
        this.precioEntrada = precioEntrada;
    }

    @Override
    public void estrategiaDeBusqueda(List<Cel> inventario) {
        if(inventario.size() >= 10) {
            for(Cel celular: inventario){
                if(celular.getModelo().equals(modeloEntrada) && celular.getPrecio() == precioEntrada){
                    celular.showInfo();
                }
            }
        }else{
            System.out.println("Este arreglo esta corto, utilizar otro");
        }
    }
}
