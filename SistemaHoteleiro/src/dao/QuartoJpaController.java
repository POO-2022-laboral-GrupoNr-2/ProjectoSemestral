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
import model.Quarto;

/**
 * Esta classe contem metodos gerados a partir das classes que sao entidades,
 * que nos permitem efectuar diversas operacoes relacionadas a
 * conexao/(persistencia de dados) do sistema com a base de dados. Metodos para
 * salvar objectos, editar, deletar, buscar todos registros, entre outros.
 *
 * @author
 */
public class QuartoJpaController implements Serializable {

    public QuartoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Quarto quarto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(quarto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Quarto quarto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            quarto = em.merge(quarto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = quarto.getId();
                if (findQuarto(id) == null) {
                    throw new NonexistentEntityException("The quarto with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Quarto quarto;
            try {
                quarto = em.getReference(Quarto.class, id);
                quarto.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The quarto with id " + id + " no longer exists.", enfe);
            }
            em.remove(quarto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Quarto> findQuartoEntities() {
        return findQuartoEntities(true, -1, -1);
    }

    public List<Quarto> findQuartoEntities(int maxResults, int firstResult) {
        return findQuartoEntities(false, maxResults, firstResult);
    }

    private List<Quarto> findQuartoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Quarto.class));
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

    public Quarto findQuarto(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Quarto.class, id);
        } finally {
            em.close();
        }
    }

    public int getQuartoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Quarto> rt = cq.from(Quarto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Quarto> getQuartoByLikeDescricao(String descricao) {
        EntityManager em = getEntityManager();
        List<Quarto> lista = null;
        try {
            lista = em.createNamedQuery("Quarto.findByLikeDescricao").
                    setParameter("descricao", "%" + descricao + "%").
                    getResultList();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            em.close();
        }
        return lista;
    }

}
