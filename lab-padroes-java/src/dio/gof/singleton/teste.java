package dio.gof.singleton;

public class teste {
    public static void main(String[] args) {
        singleton lazy = singleton.getInstancia();
        System.out.println(lazy);
        lazy = singleton.getInstancia();
        System.out.println(lazy);

        singletonEg eager = singletonEg.getInstancia();
        System.out.println(eager);
        eager = singletonEg.getInstancia();
        System.out.println(eager);

        singletonHolder holder = singletonHolder.getInstancia();
        System.out.println(holder);
        holder = singletonHolder.getInstancia();
        System.out.println(holder);
    }
    
}
