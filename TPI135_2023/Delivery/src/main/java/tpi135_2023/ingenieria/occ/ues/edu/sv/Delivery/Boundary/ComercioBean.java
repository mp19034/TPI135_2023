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


@Path("Comercio")//endpoints
public class ComercioBean implements Serializable {

    @GET
    public String comercio() { //tiene que ser igual al path para que pueda iniciar
        return "Hola Mundo";

    }
}
