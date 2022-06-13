package ej3Strategy;

import java.util.List;

public class AlgoritmoUnMax implements  IBusqueda{

    private int precioEntrada;

    public AlgoritmoUnMax(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }


    @Override
    public void estrategiaDeBusqueda(List<Cel> inventario) {
        if (inventario.size() >= 10)  {
            for (Cel celular : inventario) {
                if(celular.getPrecio() == precioEntrada){
                    celular.showInfo();
                }
            }
        }else{
            System.out.println("Este inventario esta corto, utilizar otros");
        }
    }
}