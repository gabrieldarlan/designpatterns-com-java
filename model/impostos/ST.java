package model.impostos;

import model.Orcamento;

// public class ST implements Imposto {
public class ST extends  ImpostoCondicionalTemplate {

    //! jeito antigo com repetição de códigos
    //  @Override
    // public double calcular(Orcamento orcamento) {
    //     // ST = valor >= 500 && ter algum item com valor > 100 6% || 4%
    //     if (orcamento.getValor()>=500 && existeAlgumItemComValorMaiorQueCemReais(orcamento)) {
    //         return orcamento.getValor() * 0.07;
    //     }
        
    //     return orcamento.getValor() * 0.04;
    // }

    private boolean existeAlgumItemComValorMaiorQueCemReais(Orcamento orcamento) {
        // verifica se algum item tem o valor maior que 100
       return orcamento.getItems().stream().anyMatch(item -> (item.getValor()>100));
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor()>=500 && existeAlgumItemComValorMaiorQueCemReais(orcamento);
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return  orcamento.getValor() * 0.07;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
       return orcamento.getValor() * 0.04;
    }
}
