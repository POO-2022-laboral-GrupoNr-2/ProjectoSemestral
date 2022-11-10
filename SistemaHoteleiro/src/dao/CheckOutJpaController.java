package dao;

import dao.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.CheckOut;

/**
 * Esta classe contem metodos gerados a partir das classes que sao entidades,
 * que nos permitem efectuar diversas operacoes relacionadas a conexao/(persistencia de dados) do
 * sistema com a base de dados.
 * Metodos para salvar objectos, editar, deletar, buscar todos registros, entre outros.
 *
 * @author
 */
public class CheckOutJpaController implements Serializable {

    public CheckOutJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CheckOut checkOut) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(checkOut);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CheckOut checkOut) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            checkOut = em.merge(checkOut);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = checkOut.getId();
                if (findCheckOut(id) == null) {
                    throw new NonexistentEntityException("The checkOut with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            CheckOut checkOut;
            try {
                checkOut = em.getReference(CheckOut.class, id);
                checkOut.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The checkOut with id " + id + " no longer exists.", enfe);
            }
            em.remove(checkOut);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CheckOut> findCheckOutEntities() {
        return findCheckOutEntities(true, -1, -1);
    }

    public List<CheckOut> findCheckOutEntities(int maxResults, int firstResult) {
        return findCheckOutEntities(false, maxResults, firstResult);
    }

    private List<CheckOut> findCheckOutEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CheckOut.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public CheckOut findCheckOut(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CheckOut.class, id);
        } finally {
            em.close();
        }
    }

    public int getCheckOutCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CheckOut> rt = cq.from(CheckOut.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
