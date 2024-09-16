package model.estados;

import model.Orcamento;

public interface IEstados {
    void aplicarDescontoExtra(Orcamento orcamento);
    void aprovar(Orcamento orcamento);
    void reprovar(Orcamento orcamento);
    void finalizar(Orcamento orcamento);
}
