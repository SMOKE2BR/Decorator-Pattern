package decorator;

public class Main {
    public static void main(String[] args) {
        Preco precoBase = new PrecoBase(100.0f);

        PrecoDecoratorFactory factory = PrecoDecoratorFactory.getInstance();

        Preco precoComDesconto = factory.obterDecorador("desconto", precoBase);
        Preco precoComFrete = factory.obterDecorador("frete", precoComDesconto);
        Preco precoFinal = factory.obterDecorador("imposto", precoComFrete);

        System.out.println("Preço base: " + precoBase.calcular());
        System.out.println("Preço com desconto: " + precoComDesconto.calcular());
        System.out.println("Preço com frete: " + precoComFrete.calcular());
        System.out.println("Preço final com imposto: " + precoFinal.calcular());
    }
}
