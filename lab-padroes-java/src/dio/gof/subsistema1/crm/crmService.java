package dio.gof.subsistema1.crm;

public class crmService {

    private crmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado ) {
        System.out.println("Cliente Salvo no CRM");
        System.out.println("nome");
        System.out.println("cidade");
        System.out.println("cep");
        System.out.println("estado");
    }
 }