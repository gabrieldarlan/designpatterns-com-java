package model.impostos;

import interfaces.Imposto;
import model.Orcamento;

public class ICMS implements Imposto {

    private static final double IMPOSTO_ICMS = 0.01;
    
    @Override
    public double calcular(Orcamento orcamento){
        return orcamento.getValor() * IMPOSTO_ICMS;
    }
    
}
