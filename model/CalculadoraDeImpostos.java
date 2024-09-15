package model;

import interfaces.Imposto;

public class CalculadoraDeImpostos {

    public double calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
