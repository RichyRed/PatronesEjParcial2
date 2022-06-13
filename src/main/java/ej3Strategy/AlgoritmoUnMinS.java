package ej3Strategy;

import java.util.List;

public class AlgoritmoUnMinS implements IBusqueda{

    private String modeloEntrada;

    public AlgoritmoUnMinS(String modeloEntrada) {
        this.modeloEntrada = modeloEntrada;
    }

    @Override
    public void estrategiaDeBusqueda(List<Cel> inventario) {
        if(inventario.size() <= 10) {
            for (int i = 0; i < inventario.size(); i++) {
                if(inventario.get(i).getModelo().equals(modeloEntrada)){
                    inventario.get(i).showInfo();
                }
            }
        }else{
            System.out.println("Este arreglo esta grande, utilizar otro");
        }
    }
}
