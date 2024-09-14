package model;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    private Double valor;
    private List<Item> items;

    public Orcamento(Double valor) {
        this.valor = valor;
        this.items = new ArrayList<>();
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
}
