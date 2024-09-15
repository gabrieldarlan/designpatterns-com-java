package model.impostos;

import model.Orcamento;

public class ISS extends ImpostoComposto {

    public ISS(){}


    public ISS(ImpostoComposto outroImposto) {
        super(outroImposto);
    }

    private static final double IMPOSTO_ISS = 0.07;
    
    @Override
    public double calcular(Orcamento orcamento){
        return orcamento.getValor() * IMPOSTO_ISS + this.calcularOutroImposto(orcamento);
    }
    
}
