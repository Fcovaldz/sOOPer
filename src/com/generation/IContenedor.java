package com.generation;

import com.generation.enums.TipoContenedor;

import java.util.Set;

public interface IContenedor {
    String getReferencia();
    int getVolumen();
    int getSuperficie();
    int volumenDisponible();
    int getResistencia();
    Set<IProducto> getProductos();
    TipoContenedor getTipo();
    boolean meter(IProducto producto);
    boolean resiste(IProducto producto);
}
