package decorator;

public abstract class PrecoDecorator implements Preco {
    protected Preco preco;

    public PrecoDecorator(Preco preco) {
        this.preco = preco;
    }

    public Preco getPreco() {
        return preco;
    }

    public void setPreco(Preco preco) {
        this.preco = preco;
    }

    @Override
    public float calcular() {
        return preco.calcular() + getAjuste();
    }

    public abstract float getAjuste();
}
