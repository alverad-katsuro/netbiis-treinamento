package com.curso4.unidade5.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.curso4.unidade5.LojaVirtual;
import com.curso4.unidade5.model.ClienteHasCurso;
import com.curso4.unidade5.model.ClienteHasCursoId;



/**
* Interface para realizar o cadastro do Curso.
* @author Alfredo Gabriel
* @version 1.0
* @since 04/11/2022
*/
public class VendaDAO {

    private VendaDAO(){}
      
    /** 
     * Função responsavel por armazenar os cursos no banco de dados.
     * @param curso - Recebe um objeto curso a fim de torna-lo permanente.
     */
    public static void createClienteHasCurso(ClienteHasCurso curso){
        EntityManagerFactory entityManagerFactory = LojaVirtual.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        entityManager.persist(curso);
        entityManager.flush();

        entityTransaction.commit();
        entityManager.close();

        System.out.println("ClienteHasCurso cadastrado com sucesso");
    }

    /** 
     * Função responsavel por atualizar os dados dos cursos no banco de dados.
     * @param curso - Recebe um objeto ClienteHasCurso com ID e os dados a serem atualizados.
     */
    public static void updateClienteHasCurso(ClienteHasCurso curso){
        EntityManagerFactory entityManagerFactory = LojaVirtual.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        entityManager.merge(curso);
        entityManager.flush();

        entityTransaction.commit();
        entityManager.close();

        System.out.println("ClienteHasCurso atualizado com sucesso");
    }

    
    /** 
     * Função responsavel por deletar os cursos no banco de dados.
     * @param curso - Recebe a chave primaria do objeto fim de remove-lo do banco.
     */
    public static void deleteClienteHasCurso(int curso_id){
        EntityManagerFactory entityManagerFactory = LojaVirtual.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        ClienteHasCurso curso = entityManager.find(ClienteHasCurso.class, curso_id);
        entityManager.remove(curso);

        entityTransaction.commit();
        entityManager.close();
        System.out.println("ClienteHasCurso deletado com sucesso");
    }

    
    /** 
     * Função responsavel por encontrar um determinado curso no banco de dados.
     * @param curso_id - Chave primaria do objeto curso.
     * @return ClienteHasCurso - Se encontra-lo retorna o objeto caso contrario retorna null.
     */
    public static ClienteHasCurso findClienteHasCurso_byID(ClienteHasCursoId curso_id){
        EntityManagerFactory entityManagerFactory = LojaVirtual.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        ClienteHasCurso curso = entityManager.find(ClienteHasCurso.class, curso_id);
        
        entityManager.close();

        if (curso != null){
            System.out.println("ClienteHasCurso encontrado");
            return curso;
        } else {
            System.out.println("ClienteHasCurso não encontrado");
            return null;
        }
    }

    
    /** 
     * Função responsavel por retornar 10 dos cursos presentes no banco de dados.
     * @return List<ClienteHasCurso> - retorna uma lista com até 10 cursos.
     */
    public static List<ClienteHasCurso> readClienteHasCursos(){
        EntityManagerFactory entityManagerFactory = LojaVirtual.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        TypedQuery<ClienteHasCurso> cursoQuery = entityManager.createQuery("from cliente_has_curso", ClienteHasCurso.class);
        List<ClienteHasCurso> cursos = cursoQuery.setMaxResults(10).getResultList();
        
        entityManager.close();

        if (cursos.size() > 0){
            System.out.println("ClienteHasCursos encontrados");
            return cursos;
        } else {
            System.out.println("Não foram encontrados curso no banco de dados");
            return cursos;
        }
    }
}
