package dio.gof.subsistema2.cep;

public class cepApi {
    
        private static cepApi instancia = new cepApi();
    
        private cepApi() {
            super();
        }
    
        public static cepApi getInstancia() {
            return instancia;
        }

        public String recuperarCidade(String cep){ 
            return "Brasilia";
        }

        public String recuperarEstado(String estado){ 
            return "SP";
        }
    }
