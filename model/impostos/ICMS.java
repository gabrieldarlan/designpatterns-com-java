package model.impostos;

import model.Orcamento;

public class ICMS extends  ImpostoComposto {
    
    public ICMS(){}

    public ICMS(ImpostoComposto outroImposto) {
        super(outroImposto);
    }
    
    private static final double IMPOSTO_ICMS = 0.1;
    
    @Override
    public double calcular(Orcamento orcamento){
        return orcamento.getValor() * IMPOSTO_ICMS + this.calcularOutroImposto(orcamento);
    }
    
}
