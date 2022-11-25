package com.lojavirtuall.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import com.lojavirtuall.App;
import com.lojavirtuall.model.Cliente;
import com.lojavirtuall.model.Curso;
import com.lojavirtuall.model.Pedido;
import com.lojavirtuall.model.PedidoId;



/**
* Interface para realizar o cadastro do Curso.
* @author Alfredo Gabriel
* @version 1.0
* @since 04/11/2022
*/
public class PagamentoDAO {

    private PagamentoDAO(){}
      
    /** 
     * Função responsavel por armazenar os cursos no banco de dados.
     * @param curso - Recebe um objeto curso a fim de torna-lo permanente.
     */
    public static void createPedido(Pedido curso){
        EntityManagerFactory entityManagerFactory = App.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        entityManager.persist(curso);
        entityManager.flush();

        entityTransaction.commit();
        entityManager.close();

        System.out.println("Pedido cadastrado com sucesso");
    }

    /** 
     * Função responsavel por atualizar os dados dos cursos no banco de dados.
     * @param curso - Recebe um objeto Pedido com ID e os dados a serem atualizados.
     */
    public static void updatePedido(Pedido curso){
        EntityManagerFactory entityManagerFactory = App.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        entityManager.merge(curso);
        entityManager.flush();

        entityTransaction.commit();
        entityManager.close();

        System.out.println("Pedido atualizado com sucesso");
    }

    
    /** 
     * Função responsavel por deletar os cursos no banco de dados.
     * @param curso - Recebe a chave primaria do objeto fim de remove-lo do banco.
     */
    public static void deletePedido(PedidoId clienteHasCursoId){
        EntityManagerFactory entityManagerFactory = App.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        Pedido curso = entityManager.find(Pedido.class, clienteHasCursoId);
        entityManager.remove(curso);

        entityTransaction.commit();
        entityManager.close();
        System.out.println("Pedido deletado com sucesso");
    }

    
    /** 
     * Função responsavel por encontrar um determinado curso no banco de dados.
     * @param curso_id - Chave primaria do objeto curso.
     * @return Pedido - Se encontra-lo retorna o objeto caso contrario retorna null.
     */
    public static Pedido findPedido_byID(PedidoId curso_id){
        EntityManagerFactory entityManagerFactory = App.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Pedido curso = entityManager.find(Pedido.class, curso_id);
        
        entityManager.close();

        if (curso != null){
            System.out.println("Pedido encontrado");
            return curso;
        } else {
            System.out.println("Pedido não encontrado");
            return null;
        }
    }


    public static Pedido findPedido_by_CliCur(Cliente cliente, Curso curso) {
        return findPedido_byID(new PedidoId(cliente.getClienteId(), curso.getCursoId()));
	}

    public static Pedido findPedido_by_CliCur(int cliente, int curso) {
        return findPedido_byID(new PedidoId(cliente, curso));
	}

    
    /** 
     * Função responsavel por retornar 10 dos cursos presentes no banco de dados.
     * @return List<Pedido> - retorna uma lista com até 10 cursos.
     */
    public static List<Pedido> readPedidos(){
        EntityManagerFactory entityManagerFactory = App.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        TypedQuery<Pedido> cursoQuery = entityManager.createQuery("from Pedido", Pedido.class);
        List<Pedido> cursos = cursoQuery.setMaxResults(10).getResultList();
        
        entityManager.close();

        if (cursos.size() > 0){
            System.out.println("Pedidos encontrados");
            return cursos;
        } else {
            System.out.println("Não foram encontrados curso no banco de dados");
            return cursos;
        }
    }
}
