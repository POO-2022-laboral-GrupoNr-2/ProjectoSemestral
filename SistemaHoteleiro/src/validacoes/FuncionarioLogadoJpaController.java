/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validacoes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import validacoes.exceptions.NonexistentEntityException;
import validacoes.exceptions.PreexistingEntityException;

/**
 *
 * @author Augusto Chissano
 */
public class FuncionarioLogadoJpaController implements Serializable {

    public FuncionarioLogadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(FuncionarioLogado funcionarioLogado) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(funcionarioLogado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findFuncionarioLogado(funcionarioLogado.getId()) != null) {
                throw new PreexistingEntityException("FuncionarioLogado " + funcionarioLogado + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(FuncionarioLogado funcionarioLogado) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            funcionarioLogado = em.merge(funcionarioLogado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = funcionarioLogado.getId();
                if (findFuncionarioLogado(id) == null) {
                    throw new NonexistentEntityException("The funcionarioLogado with id " + id + " no longer exists.");
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
            FuncionarioLogado funcionarioLogado;
            try {
                funcionarioLogado = em.getReference(FuncionarioLogado.class, id);
                funcionarioLogado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The funcionarioLogado with id " + id + " no longer exists.", enfe);
            }
            em.remove(funcionarioLogado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<FuncionarioLogado> findFuncionarioLogadoEntities() {
        return findFuncionarioLogadoEntities(true, -1, -1);
    }

    public List<FuncionarioLogado> findFuncionarioLogadoEntities(int maxResults, int firstResult) {
        return findFuncionarioLogadoEntities(false, maxResults, firstResult);
    }

    private List<FuncionarioLogado> findFuncionarioLogadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(FuncionarioLogado.class));
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

    public FuncionarioLogado findFuncionarioLogado(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(FuncionarioLogado.class, id);
        } finally {
            em.close();
        }
    }

    public int getFuncionarioLogadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<FuncionarioLogado> rt = cq.from(FuncionarioLogado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
