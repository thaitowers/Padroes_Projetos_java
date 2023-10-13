package one;

import facade.Facade;
import one.Singleton.gof.SingletonEager;
import one.Singleton.gof.SingletonLazy;
import one.Singleton.gof.SingletonLazyHolder;
import one.Strategy.ComportamentoAgressivo;
import one.Strategy.ComportamentoDefensivo;
import one.Strategy.ComportamentoNormal;
import one.Strategy.Robo;

public class test {

	//Singleton
	
	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.print(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.print(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.print(eager);
		eager = SingletonEager.getInstancia();
		System.out.print(eager);
			
			
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.print(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.print(lazyHolder);
	
	//Strategy
		Comportamento defensivo = new ComportamentoDefensivo ();
		Comportamento normal = new ComportamentoNormal(); 
		Comportamento agressivo = new ComportamentoAgressivo(); 

		Robo robo =new Robo ();
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
	
		
		//Facade
		Facade facade = new Facade();
		facade.migrarCliente("Avenido", "33820741");
	}

}
