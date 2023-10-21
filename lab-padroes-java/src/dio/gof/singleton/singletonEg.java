package dio.gof.singleton;

public class singletonEg {
    private static singletonEg instancia = new singletonEg();

    private singletonEg() {
        super();
    }

    public static singletonEg getInstancia() {
        return instancia;
    }
}
