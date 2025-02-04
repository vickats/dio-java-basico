package one.digitalinnovation.gof.singleton;
/* 
 * Singleton "Lazy Holder"
 * @author vickats
 */
public class SingletonLazyHolder {
    private static class Holder{
    public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }
    
    public static SingletonLazyHolder getInstancia(){
        return Holder.instancia;
    }
}
