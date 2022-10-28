package connection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
    //O metodo getEmf() retorna o EntityManagerFactory

    public static EntityManagerFactory getEmf() {

        return Persistence.createEntityManagerFactory("RufragoPU");
    }

}
