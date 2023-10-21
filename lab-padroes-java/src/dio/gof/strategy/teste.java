package dio.gof.strategy;

public class teste {

    public static void main(String[] args) {

        comportamento normal = new comportamentoNormal();
        comportamento malemolente = new comportamentoMalemolente();
        
        robo robo = new robo();
        robo.setStrategy(normal);

        robo.mover();
        robo.mover();

        robo.setStrategy(malemolente);
        robo.mover();
        robo.mover();
    }

    
}
