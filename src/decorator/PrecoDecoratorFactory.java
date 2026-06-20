package decorator;

public class PrecoDecoratorFactory {
    private static final PrecoDecoratorFactory instance = new PrecoDecoratorFactory();

    private PrecoDecoratorFactory() {}

    public static PrecoDecoratorFactory getInstance() {
        return instance;
    }

    public Preco obterDecorador(String decorador, Preco preco) {
        switch (decorador.toLowerCase()) {
            case "desconto": return new Desconto(preco);
            case "frete": return new Frete(preco);
            case "imposto": return new Imposto(preco);
            default: throw new IllegalArgumentException("Decorador inválido: " + decorador);
        }
    }
}
