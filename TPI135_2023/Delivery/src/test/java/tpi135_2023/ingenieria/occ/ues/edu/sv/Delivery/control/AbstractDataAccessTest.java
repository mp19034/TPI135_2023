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
public class AbstractDataAccessTest {

    public AbstractDataAccessTest() {
    }

    /**
     * Test of crear method, of class AbstractDataAccess.
     */
    @Test
    public void testcrear() {
        System.out.println("crear");
        Comercio nuevo = new Comercio();
        ComercioBean instance = new ComercioBean();
        assertThrows(IllegalArgumentException.class, () -> {
            instance.crear(null);
        });
        assertThrows(IllegalStateException.class, () -> {
            instance.crear(nuevo);
        });
        EntityManager mockEM = Mockito.mock(EntityManager.class);
        instance.em = mockEM;
        instance.crear(nuevo);

        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testFindByid() throws Exception {
        System.out.println("findByid");
        int id = 1;
        EntityManager mockME = Mockito.mock(EntityManager.class);

        ComercioBean cut = new ComercioBean();
        Comercio esperado = new Comercio();

        Mockito.when(mockME.find(Comercio.class, id)).thenReturn(esperado);
        assertThrows(IllegalArgumentException.class, () -> {
            cut.findById(null);
        });
        assertThrows(IllegalStateException.class, () -> {
            cut.findById(id);
        });
        cut.em = mockME;
        Comercio encontrado = cut.findById(id);
        assertNotNull(encontrado);
        assertEquals(esperado, encontrado);
        
        ComercioBean espia = Mockito.spy(ComercioBean.class);
        espia.em=mockME;
    
        Mockito.when(espia.getEntityManager()).thenThrow(NullPointerException.class);
        try {
            espia.findById(id);
        } catch (Exception ex) {
        }
        Mockito.verify(espia,Mockito.times(1)).getEntityManager();
    }


}
