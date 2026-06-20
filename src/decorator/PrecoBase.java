package decorator;

public class PrecoBase implements Preco {
    private float valorBase;

    public PrecoBase(float valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public float calcular() {
        return valorBase;
    }
}
