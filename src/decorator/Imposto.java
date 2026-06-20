package decorator;

public class Imposto extends PrecoDecorator {
    public Imposto(Preco preco) {
        super(preco);
    }

    @Override
    public float getAjuste() {
        return preco.calcular() * 0.1f; // 10% de imposto
    }
}
