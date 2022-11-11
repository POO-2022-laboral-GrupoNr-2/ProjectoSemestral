package connection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Augusto Chissano
 */
public class ConnectionFactory {
    //O metodo getEmf() retorna o EntityManagerFactory
    /**
     * Este cria uma ENTITYMANAGERfACTORY
     * @return ENTITYMANAGERfACTORY
     */
    public static EntityManagerFactory getEmf() {

        return Persistence.createEntityManagerFactory("RufragoPU");
    }

}
