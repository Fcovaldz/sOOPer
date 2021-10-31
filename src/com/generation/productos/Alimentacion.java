package com.generation.productos;

import com.generation.IProducto;
import com.generation.enums.Categoria;

public class Alimentacion extends Producto{
    public Alimentacion(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.ALIMENTACION;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        return Categoria.ALIMENTACION.equals(p.getCategoria());
    }
}
