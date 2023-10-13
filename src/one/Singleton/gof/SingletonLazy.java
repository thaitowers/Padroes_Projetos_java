package one.Singleton.gof;

/**
 * Singleton "preguiçoso".
 * @author thaitorres 

 */


public class SingletonLazy {
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super ();
	}
		public static SingletonLazy getInstancia () {
			if (instancia == null) {
				instancia = new SingletonLazy ();
			}
			return instancia;
		}
}
