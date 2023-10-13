package subsistema2cep;

public class CepApi {
	private static CepApi instancia = new CepApi ();
	
	private CepApi () {
		super ();
	}
	
	public static CepApi getIntancia () {
		return instancia;
	}
	
	public String recuperarCidade (String cep) {
		return "Cacilandia";
	}
	public String recuperarEstado (String cep) {
		return "MG";
	}
}
