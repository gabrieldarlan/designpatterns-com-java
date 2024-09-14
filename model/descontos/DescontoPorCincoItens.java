package model.descontos;

import interfaces.Desconto;
import model.Orcamento;

public class DescontoPorCincoItens implements Desconto {

    private Desconto proximDesconto;

    @Override
    public double descontar(Orcamento orcamento) {
        return (orcamento.getItems().size()) > 5 ? orcamento.getValor() * 0.1 : proximDesconto.descontar(orcamento);
    }

    @Override
    public Desconto proximoDesconto(Desconto proximoDesconto) {
        return this.proximDesconto = proximoDesconto;
    }
}
