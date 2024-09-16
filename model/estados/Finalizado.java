package model.estados;
import java.util.InputMismatchException;
import model.Orcamento;

public class Finalizado implements IEstados{
    
    @Override
    public void aplicarDescontoExtra(Orcamento orcamento) {
        throw new InputMismatchException("Orçamentos finalizados não podem ter descontos extras");
    }
    
    @Override
    public void aprovar(Orcamento orcamento) {
        throw new InputMismatchException("Orçamento já está finalizado, não é possível aprovar.");
    }
    
    @Override
    public void reprovar(Orcamento orcamento) {
        throw new InputMismatchException("Orçamento já está finalizado, não é possível reprovar");
    }
    
    @Override
    public void finalizar(Orcamento orcamento) {
        throw new InputMismatchException("Orçamento já está finalizado");
    }
    
}
