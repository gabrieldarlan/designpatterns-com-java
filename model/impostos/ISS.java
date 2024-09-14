package model.impostos;

import interfaces.Imposto;
import model.Orcamento;

public class ISS implements Imposto{

    private static final double IMPOSTO_ISS = 0.07;
    
    @Override
    public double calcular(Orcamento orcamento){
        return orcamento.getValor() * IMPOSTO_ISS;
    }
    
}
