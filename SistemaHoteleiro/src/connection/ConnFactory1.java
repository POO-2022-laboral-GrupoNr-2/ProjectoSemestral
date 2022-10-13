
package connection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ConnFactory1 {
    //O metodo getEmf() retorna o EntityManagerFactory
    
    public static EntityManagerFactory getEmf(){
        
        return Persistence.createEntityManagerFactory("Persistence");
        
    }
    
}
