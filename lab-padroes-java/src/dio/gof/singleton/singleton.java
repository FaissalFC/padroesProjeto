package dio.gof.singleton;


public class singleton {
    private static singleton instancia;

    private singleton() {
        super();
    }

    public static singleton getInstancia(){
        if (instancia == null){
            instancia = new singleton();
        }
        return instancia;
    }
}
