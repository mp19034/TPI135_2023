/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.control;

import java.io.Serializable;
import javax.persistence.EntityManager;

/**
 *
 * @author edwin
 */
public abstract class AbstractDataAccess<T> implements Serializable {

    public abstract EntityManager getEntityManager();
    
    protected final Class clase;

    public AbstractDataAccess(Class clase) {
        this.clase = clase;
    }

    public void crear(T nuevo) throws IllegalArgumentException, IllegalStateException {
        if (nuevo != null) {
            EntityManager em = null;
            try {
                em = this.getEntityManager();
            } catch (Exception ex) {
                throw new IllegalStateException("NO SE PUEDE TENER UN AMBITO DE PERSISTENCIA 1");
            }
            if (em != null) {
                try {
                    em.persist(nuevo);
                    return;
                } catch (Exception ex) {
                    throw new IllegalStateException("NO SE PUEDE ALMACENAR EL REGISTRO", ex);
                }
            }
            throw new IllegalStateException("NO SE PUEDE TENER UN AMBITO DE PERSISTENCIA 2");
        }
        throw new IllegalArgumentException();
    }
    public T findById(final Object id) throws IllegalArgumentException, IllegalStateException {
        if (id != null) {
            EntityManager em = null;
            try {
                em = this.getEntityManager();
            } catch (Exception ex) {
            }
            if (em != null) {
                return (T) em.find(clase, id);
            }
            throw new IllegalStateException("NO SE PUEDE TENER UN AMBITO DE PERSISTENCIA");
        }
        throw new IllegalArgumentException();
    }

}
