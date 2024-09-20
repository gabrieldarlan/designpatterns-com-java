package model;

import java.util.Date;
import java.util.List;

public class NotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private Date dataEmissao;
    private List<Item> itens;
    private Double valorTotal;
    private String nomeCliente;
    private String cpfCliente;
    private String observacoes;

    
    public NotaFiscal(String razaoSocial, String cnpj, Date dataEmissao, List<Item> itens, Double valorTotal,
            String nomeCliente, String cpfCliente, String observacoes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataEmissao = dataEmissao;
        this.itens = itens;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.observacoes = observacoes;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Date getDataEmissao() {
        return dataEmissao;
    }
    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    public List<Item> getItens() {
        return itens;
    }
    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getCpfCliente() {
        return cpfCliente;
    }
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NotaFiscal{");
        sb.append("razaoSocial=").append(razaoSocial);
        sb.append(", cnpj=").append(cnpj);
        sb.append(", dataEmissao=").append(dataEmissao);
        sb.append(", itens=").append(itens);
        sb.append(", valorTotal=").append(valorTotal);
        sb.append(", nomeCliente=").append(nomeCliente);
        sb.append(", cpfCliente=").append(cpfCliente);
        sb.append(", observacoes=").append(observacoes);
        sb.append('}');
        return sb.toString();
    }

    

}
