package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotaFiscalBuilder {
    
    private String razaoSocial;
    private String cnpj;
    private Date dataEmissao;
    private List<Item> itens;
    private Double valorTotal;
    private String nomeCliente;
    private String cpfCliente;
    private String observacao;
    
    public NotaFiscalBuilder() {
        this.itens = new ArrayList<Item>();
        this.dataEmissao = new Date();
    }
    
    public NotaFiscalBuilder comRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
        return this;
    }
    
    public NotaFiscalBuilder comCnpj(String cnpj){
        this.cnpj = cnpj;
        return this;
    }
    
    public NotaFiscalBuilder comDataEmissao(Date dataEmissao){
        this.dataEmissao = dataEmissao;
        return this;
    }
    
    public NotaFiscalBuilder comItem(Item item){
        this.itens.add(item);
        return this;
    }
    
    public NotaFiscalBuilder comNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
        return this;
    }
    
    public NotaFiscalBuilder comCpfCliente(String cpfCliente){
        this.cpfCliente = cpfCliente;
        return this;
    }
    
    public NotaFiscalBuilder comObservacao(String observacao){
        this.observacao = observacao;
        return this;
    }
    
    public NotaFiscal construir(){
        return new NotaFiscal(razaoSocial, cnpj, dataEmissao, itens, calcularValorTotal(), nomeCliente, cpfCliente, observacao);
    }

    private double calcularValorTotal() {
        return itens.stream().mapToDouble(Item::getValor).reduce(0,Double::sum);
    }
}
