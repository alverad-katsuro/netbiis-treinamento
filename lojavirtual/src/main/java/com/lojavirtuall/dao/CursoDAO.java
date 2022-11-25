package com.lojavirtuall.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.lojavirtuall.App;
import com.lojavirtuall.model.Curso;



/**
* Interface para realizar o cadastro do Curso.
* @author Alfredo Gabriel
* @version 1.0
* @since 04/11/2022
*/
public class CursoDAO {

    private CursoDAO(){}
      
    /** 
     * Função responsavel por armazenar os cursos no banco de dados.
     * @param curso - Recebe um objeto curso a fim de torna-lo permanente.
     */
    public static void createCurso(Curso curso){
        EntityManagerFactory entityManagerFactory = App.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        entityManager.persist(curso);
        entityManager.flush();

        entityTransaction.commit();
        entityManager.close();

        System.out.println("Curso cadastrado com sucesso");
    }

    /** 
     * Função responsavel por atualizar os dados dos cursos no banco de dados.
     * @param curso - Recebe um objeto Curso com ID e os dados a serem atualizados.
     */
    public static void updateCurso(Curso curso){
        EntityManagerFactory entityManagerFactory = App.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        entityManager.merge(curso);
        entityManager.flush();

        entityTransaction.commit();
        entityManager.close();

        System.out.println("Curso atualizado com sucesso");
    }

    
    /** 
     * Função responsavel por deletar os cursos no banco de dados.
     * @param curso - Recebe a chave primaria do objeto fim de remove-lo do banco.
     */
    public static void deleteCurso(int curso_id){
        EntityManagerFactory entityManagerFactory = App.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        Curso curso = entityManager.find(Curso.class, curso_id);
        entityManager.remove(curso);

        entityTransaction.commit();
        entityManager.close();
        System.out.println("Curso deletado com sucesso");
    }

    
    /** 
     * Função responsavel por encontrar um determinado curso no banco de dados.
     * @param curso_id - Chave primaria do objeto curso.
     * @return Curso - Se encontra-lo retorna o objeto caso contrario retorna null.
     */
    public static Curso findCurso_byID(int curso_id){
        EntityManagerFactory entityManagerFactory = App.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Curso curso = entityManager.find(Curso.class, curso_id);
        
        entityManager.close();

        if (curso != null){
            System.out.println("Curso encontrado");
            return curso;
        } else {
            System.out.println("Curso não encontrado");
            return null;
        }
    }

    
    /** 
     * Função responsavel por retornar 10 dos cursos presentes no banco de dados.
     * @return List<Curso> - retorna uma lista com até 10 cursos.
     */
    public static List<Curso> readCursos(){
        EntityManagerFactory entityManagerFactory = App.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        TypedQuery<Curso> cursoQuery = entityManager.createQuery("from Curso", Curso.class);
        List<Curso> cursos = cursoQuery.setMaxResults(10).getResultList();
        
        entityManager.close();

        if (cursos.size() > 0){
            System.out.println("Cursos encontrados");
            return cursos;
        } else {
            System.out.println("Não foram encontrados curso no banco de dados");
            return cursos;
        }
    }
}
