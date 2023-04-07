/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.Boundary;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.io.Serializable;

/**
 *
 * @author edwin
 */
@Path("direccion")
public class DireccionBean implements Serializable {

    @GET
    public String Direccion() {
        return "La de la madre penia";
    }
    @GET
    @Path("{id}")
    public String ComercioUno() {
        return "La pizza hut";
    }
}