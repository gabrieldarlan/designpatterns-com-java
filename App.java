
import interfaces.Imposto;
import model.Orcamento;
import model.impostos.ICMS;
import model.impostos.ISS;


public class App {
    public static void main(String[] args) {
        System.out.println("Design Patterns");
        System.out.println();
        
        // Orcamento orcamento = new Orcamento(300.0);
        
        // Imposto icms = new ICMS();
        // Imposto iss = new ISS();
        // Imposto pis = new PIS();
        // Imposto cofins = new COFINS();
        // Imposto st = new ST();
        
        
        // CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        // double valorICMS = calculadora.calcular(orcamento, icms);
        // double valorISS = calculadora.calcular(orcamento, iss);
        // double valorPIS = calculadora.calcular(orcamento, pis);
        
        // // ====================================================
        
        // CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        // orcamento.adicionarItem(new Item("Teclado Mecanico", 300.0));
        // orcamento.adicionarItem(new Item("Teclado Mecanico", 100.0));
        // orcamento.adicionarItem(new Item("Teclado Mecanico", 100.0));
        // orcamento.adicionarItem(new Item("Teclado Mecanico", 100.0));
        // orcamento.adicionarItem(new Item("Teclado Mecanico", 100.0));
        // // orcamento.adicionarItem(new Item("Teclado Mecanico", 100.0));
        
        // double descontoTotal = calculadoraDeDescontos.calcular(orcamento);
        
        // System.out.println(descontoTotal);
        
        // double impostoCofins = calculadora.calcular(orcamento, cofins);
        // System.out.println("Valor imposto cofins: "+ impostoCofins);
        
        
        // double impostoSt = calculadora.calcular(orcamento, st);
        // System.out.println("Valor imposto cofins: "+ impostoSt);

        //! Composição - Decorator
        Imposto iss = new ISS(new ICMS());

        Orcamento orcamento = new Orcamento(500.0);

        double valor = iss.calcular(orcamento);

        System.out.println(valor);
        
    }
}