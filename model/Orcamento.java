package model;

import java.util.ArrayList;
import java.util.List;
import model.estados.EmAprovacao;
import model.estados.IEstados;

public class Orcamento {
    
    private Double valor;
    private List<Item> items;
    private IEstados estadoAtual;
    
    public Orcamento(Double valor) {
        this.valor = valor;
        this.items = new ArrayList<>();
        this.estadoAtual = new EmAprovacao();
    }
    
    public Double getValor() {
        return valor;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public List<Item> getItems() {
        return items;
    }
    
    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    public void adicionarItem(Item item){
        this.items.add(item);
    }
    
    public IEstados getEstadoAtual() {
        return estadoAtual;
    }
    
    public void setEstadoAtual(IEstados estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void aplicarDescontoExtra(){
        this.estadoAtual.aplicarDescontoExtra(this);
    }

    public void aprovar(){
        this.estadoAtual.aprovar(this);
    }

    public void reprovar(){
        this.estadoAtual.reprovar(this);
    }

    public void finalizar(){
        this.estadoAtual.finalizar(this);
    }
}
