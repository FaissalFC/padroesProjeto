package dio.gof.strategy;

public class robo {
    private comportamento strategy;

    public void setStrategy(comportamento strategy) {
        this.strategy = strategy;
    }

    public void mover() {
        strategy.mover();
    }
}
