package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {
    public static void main(String[] args) {
        //Testes Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        
        //Testes Strategy
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
        
        Robo robo = new Robo();
        robo.setStrategy(normal);
        
        robo.mover();
        robo.mover();
        
        robo.setStrategy(defensivo);
        
        robo.mover();
        robo.mover();
        
        robo.setStrategy(agressivo);
        
        robo.mover();
        robo.mover();
        
        // Testes Facade
        Facade facade = new Facade();
        facade.migrarCliente("Bob", "123456");
    }
    
}
