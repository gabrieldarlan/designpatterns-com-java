package model;

import interfaces.Imposto;

public class CalculadoraDeImpostos {

    // public double realizarCalculo(Orcamento orcamento, String imposto) {
    //     if ("ICMS".equals(imposto)) {
    //         return orcamento.getValor() * 0.01;
    //     } else if ("ISS".equals(imposto)) {
    //         return orcamento.getValor() * 0.07;
    //     }

    //     return 0.0;
    // }


    // public double realizarCalculoICMS(Orcamento orcamento) {
    //     return new ICMS().calcular(orcamento);
    // }

    //   public double realizarCalculoISS(Orcamento orcamento) {
    //     return new ISS().calcular(orcamento);
    // }

    public double calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
