package decorator;

public class Desconto extends PrecoDecorator {
    public Desconto(Preco preco) {
        super(preco);
    }

    @Override
    public float getAjuste() {
        return -10.0f; // desconto fixo
    }
}
