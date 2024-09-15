package model.impostos;

import model.Orcamento;

// public class COFINS  implements Imposto  {
    public class COFINS extends ImpostoCondicionalTemplate{

        @Override
        public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
          return orcamento.getValor() >= 500;
        }

        @Override
        public double maximaTaxacao(Orcamento orcamento) {
            return orcamento.getValor() * 0.07;
        }

        @Override
        public double minimaTaxacao(Orcamento orcamento) {
            return orcamento.getValor() * 0.05;
        }

    
}
