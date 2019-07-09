/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.evaluacion.controlador;

import co.edu.utp.isc.prog4.evaluacion.modelo.Pregunta;
import co.edu.utp.isc.prog4.evaluacion.modelo.Prueba;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author utp
 */
public class ProfesorControlador {

    private static ProfesorControlador instance;

    private ProfesorControlador() {
    }

    public static ProfesorControlador getInstance() {
        if (instance == null) {
            instance = new ProfesorControlador();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EvaluacionPU");
        return emf.createEntityManager();
    }

    public Prueba crearPrueba(String materia, String nombre, Double nota) {
        Prueba resp = new Prueba(materia, nombre, nota);

        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        //em.persist(resp);
        resp = em.merge(resp);

        em.getTransaction().commit();
        em.close();
        System.out.println("GuARDO!");

        return resp;
    }

    public List<Prueba> listarPruebas() {
        List<Prueba> resp = null;

        EntityManager em = getEntityManager();
        Query q = em.createQuery("SELECT p FROM Prueba p");
        resp = (List<Prueba>) q.getResultList();

        em.close();

        return resp;
    }
    
    public void eliminarPrueba(Long id){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        
        Prueba p = em.find(Prueba.class, id);
        if(p != null){
            em.remove(p);
        }

        em.getTransaction().commit();
        em.close();
    }

    public Prueba consultarPrueba(Long id) {
        Prueba resp = null;

        EntityManager em = getEntityManager();
        resp = em.find(Prueba.class, id);
        
        em.close();

        return resp;
    }

}
