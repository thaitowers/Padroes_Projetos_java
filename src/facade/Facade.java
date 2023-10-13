package facade;

import subsistema1.CrmService;
import subsistema2cep.CepApi;

public class Facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getIntancia().recuperarCidade(cep);
		String estado = CepApi.getIntancia().recuperarEstado(cep);

		CrmService.gravarCliente(nome, cep, cidade, estado);
	}

}

