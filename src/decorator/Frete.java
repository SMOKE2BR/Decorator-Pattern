package decorator;

public class Frete extends PrecoDecorator {
    public Frete(Preco preco) {
        super(preco);
    }

    @Override
    public float getAjuste() {
        return 15.0f; // frete fixo
    }
}
