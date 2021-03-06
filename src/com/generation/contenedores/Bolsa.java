package com.generation.contenedores;

import com.generation.enums.TipoContenedor;

import java.time.LocalDate;

public class Bolsa extends Contenedor{
    private int ancho;
    public Bolsa(String referencia, int alto, int ancho, int resistencia, LocalDate localDate) {
        super(referencia, alto, resistencia);
        this.ancho = ancho;
    }

    @Override
    public TipoContenedor getTipo() {
        return TipoContenedor.BOLSA;
    }

    @Override
    public int getSuperficie() {
        int radio = getDiametro()/2;
        return (int)(Math.PI * radio * radio);
    }

    private int getDiametro(){
        return (int)((2 * ancho) / Math.PI);
    }

}
