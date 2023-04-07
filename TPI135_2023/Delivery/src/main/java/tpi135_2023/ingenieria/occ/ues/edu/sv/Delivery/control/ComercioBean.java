/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.control;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Comercio;

/**
 *
 * @author edwin
 */
//prueba
//@Path("comercio")//seria los endpoint
@Stateless
@LocalBean
public  class ComercioBean extends AbstractDataAccess<Comercio> implements Serializable {
    
    @PersistenceContext(unitName = "Delivery_2023")
    EntityManager em;
    
      @Override
    public EntityManager getEntityManager(){
        return em;
    }  
    
    public ComercioBean() {
        super(Comercio.class);
    }
//    @GET
//    public String Comercio() {
//        return "Hola mundo TPI135_2023";
//    }
//
//    @GET
//    @Path("{id}")
//    public String ComercioUno() {
//        return "El pollo Campero";
//    }

    
    

}
