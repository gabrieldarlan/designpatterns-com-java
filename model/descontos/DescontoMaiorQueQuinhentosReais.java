package model.descontos;

import interfaces.Desconto;
import java.util.List;
import model.Item;
import model.Orcamento;

public class DescontoMaiorQueQuinhentosReais implements Desconto {
    
    private Desconto proximDesconto;
    
    @Override
    public double descontar(Orcamento orcamento) {
        
        // ! Não apagar
        // ! return (orcamento.getValor() > 500.0) ? orcamento.getValor() * 0.06
        // ! : proximDesconto.descontar(orcamento);
        
        double valorTotalCompra = valorTotalCompra(orcamento.getItems());
        return (valorTotalCompra > 500.0) ? valorTotalCompra * 0.06
        : proximDesconto.descontar(orcamento);
    }
    
    @Override
    public Desconto proximoDesconto(Desconto proximoDesconto) {
        return this.proximDesconto = proximoDesconto;
    }
    
    private double valorTotalCompra(List<Item> items) {
        // double valorSoma = 0;
        // for (Item item : items) {
        //     valorSoma += item.getValor();
        // }
        // System.out.println("Valor total " + valorSoma);
        double valorSoma = items.stream().mapToDouble(Item::getValor).reduce(0,Double::sum);
        System.out.println("Valor total " + valorSoma);
    
        return valorSoma;
        
    }
    
}
