/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author edwin
 */
@Embeddable
public class ProductoComercioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_producto")
    private int idProducto;
    @Basic(optional = false)
    @Column(name = "id_comercio")
    private long idComercio;

    public ProductoComercioPK() {
    }

    public ProductoComercioPK(int idProducto, long idComercio) {
        this.idProducto = idProducto;
        this.idComercio = idComercio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public long getIdComercio() {
        return idComercio;
    }

    public void setIdComercio(long idComercio) {
        this.idComercio = idComercio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idProducto;
        hash += (int) idComercio;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoComercioPK)) {
            return false;
        }
        ProductoComercioPK other = (ProductoComercioPK) object;
        if (this.idProducto != other.idProducto) {
            return false;
        }
        if (this.idComercio != other.idComercio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.ProductoComercioPK[ idProducto=" + idProducto + ", idComercio=" + idComercio + " ]";
    }
    
}
