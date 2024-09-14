package model.impostos;
import interfaces.Imposto;
import model.Orcamento;

public class PIS implements Imposto{
    
    private static final double IMPOSTO_PIS = 0.05;

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * IMPOSTO_PIS;
    }
    
}
