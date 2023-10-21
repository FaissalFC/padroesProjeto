package dio.gof.facade;

import dio.gof.subsistema1.crm.crmService;
import dio.gof.subsistema2.cep.cepApi;

public class facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = cepApi.getInstancia().recuperarCidade(cep);
        String estado = cepApi.getInstancia().recuperarEstado(cep);

        crmService.gravarCliente(nome, cep, cidade, estado);


    }
}
