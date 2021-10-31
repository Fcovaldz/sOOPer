package com.generation;

import com.generation.contenedores.Contenedor;
import com.generation.enums.Categoria;

public interface IProducto {
    String getReferencia();
    int getPeso();
    int getVolumen();
    Categoria getCategoria();
    boolean esCompatible(IProducto p);
    boolean tengoEspacio(IContenedor contenedor);

    void meter(Contenedor contenedor);
}
