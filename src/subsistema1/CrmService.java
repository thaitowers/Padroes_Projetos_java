package subsistema1;

public class CrmService {
	
	private CrmService () {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado ) {
		System.out.println ("Cliente Salvo no sistema do CRM:");
		System.out.println ("Nome:");
		System.out.println ("CEP:");
		System.out.println ("Cidade:");
		System.out.println ("Estado:");
	}

}
