/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.control;

import javax.persistence.EntityManager;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Comercio;

/**
 *
 * @author edwin
 */
public class ComercioBeanTest {
    
    public ComercioBeanTest() {
    }

    /**
     * Test of getEntityManager method, of class ComercioBean.
     */
    @Test
    public void testcrear() {
        System.out.println("crear");
        Comercio nuevo = new Comercio();
        ComercioBean instance = new ComercioBean();
        assertThrows(IllegalArgumentException.class,()->{
            instance.crear(null);
        });
        assertThrows(IllegalStateException.class,()->{
            instance.crear(nuevo);
        });
        EntityManager mockEM = Mockito.mock(EntityManager.class);
        instance.em = mockEM;
        instance.crear(nuevo);
                
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
 
            
    
}
