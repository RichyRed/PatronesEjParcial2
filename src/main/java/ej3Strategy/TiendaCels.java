package ej3Strategy;

import java.util.ArrayList;
import java.util.List;

public class TiendaCels {
    private String name;
    private List<Cel> inventario = new ArrayList<>();
    private IBusqueda estrategiaBusqeuda;

    public TiendaCels(String name) {
        this.name = name;
    }

    public void addCelular(Cel celular){
        inventario.add(celular);
    }

    public IBusqueda getEstrategiaBusqeuda() {
        return estrategiaBusqeuda;
    }

    public void setEstrategiaBusqeuda(IBusqueda estrategiaBusqeuda) {
        this.estrategiaBusqeuda = estrategiaBusqeuda;
    }

    public void iniciarAlgoritmo(){
        estrategiaBusqeuda.estrategiaDeBusqueda(inventario);
    }
}
