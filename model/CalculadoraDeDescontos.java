package model;

import interfaces.Desconto;
import model.descontos.DescontoMaiorQueQuinhentosReais;
import model.descontos.DescontoPorCincoItens;
import model.descontos.SemDesconto;

public class CalculadoraDeDescontos {
    // public double calcular(Orcamento orcamento) {
    // // ! 1 Regra, quero poder dar desconto para mais que 5 itens.

    // if (orcamento.getItems().size() > 5) {
    // return orcamento.getValor() * 0.1;
    // } else if (orcamento.getValor() > 500.0) {
    // return orcamento.getValor() * 0.05;
    // }

    // return 0;
    // }

    // public double calcular(Orcamento orcamento) {
    // double desconto = new DescontoPorCincoItens().descontar(orcamento);

    // if (desconto == 0) {
    // desconto = new DescontoMaiorQueQuinhentosReais().descontar(orcamento);
    // }
    // return desconto;
    // }

    public double calcular(Orcamento orcamento) {
        Desconto descontoPorCincoItens = new DescontoPorCincoItens();
        Desconto descontoPorMaisDeQuinhetosReais = new DescontoMaiorQueQuinhentosReais();
        Desconto semDesconto = new SemDesconto();

        descontoPorCincoItens.proximoDesconto(descontoPorMaisDeQuinhetosReais);
        descontoPorMaisDeQuinhetosReais.proximoDesconto(semDesconto);

        return descontoPorCincoItens.descontar(orcamento);
    }
}
