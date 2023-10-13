package one.Singleton.gof;

/**
 * Singleton "Apressado".
 * @author thaitorres 

 */


public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super ();
	}
		public static SingletonEager getInstancia () {
		 return instancia;
		}
}
