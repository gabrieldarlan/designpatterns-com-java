import interfaces.Imposto;
import model.CalculadoraDeDescontos;
import model.CalculadoraDeImpostos;
import model.Item;
import model.Orcamento;
import model.impostos.ICMS;
import model.impostos.ISS;
import model.impostos.PIS;

public class App {
    public static void main(String[] args) {
        System.out.println("Design Patterns");
        System.out.println();

        Orcamento orcamento = new Orcamento(300.0);

        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        Imposto pis = new PIS();

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        double valorICMS = calculadora.calcular(orcamento, icms);
        double valorISS = calculadora.calcular(orcamento, iss);
        double valorPIS = calculadora.calcular(orcamento, pis);

        // ====================================================

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        orcamento.adicionarItem(new Item("Teclado Mecanico", 300.0));
        orcamento.adicionarItem(new Item("Teclado Mecanico", 100.0));
        orcamento.adicionarItem(new Item("Teclado Mecanico", 100.0));
        orcamento.adicionarItem(new Item("Teclado Mecanico", 100.0));
        orcamento.adicionarItem(new Item("Teclado Mecanico", 100.0));
        // orcamento.adicionarItem(new Item("Teclado Mecanico", 100.0));

        double descontoTotal = calculadoraDeDescontos.calcular(orcamento);

        System.out.println(descontoTotal);
    }
}