package ej3Strategy;

import java.util.List;

public class AlgoritmoUnMaxS implements IBusqueda{

    private String modeloEntrada;

    public AlgoritmoUnMaxS(String modeloEntrada) {
        this.modeloEntrada = modeloEntrada;
    }

    @Override
    public void estrategiaDeBusqueda(List<Cel> inventario) {
        if(inventario.size() >= 10) {
            for(Cel celular: inventario){
                if(celular.getModelo().equals(modeloEntrada)){
                    celular.showInfo();
                }
            }
        }else{
            System.out.println("Este arreglo esta corto, utilizar otro");
        }
    }
}
