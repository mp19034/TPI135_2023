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
public class ProductoTipoProductoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_producto")
    private int idProducto;
    @Basic(optional = false)
    @Column(name = "id_tipo_producto")
    private int idTipoProducto;

    public ProductoTipoProductoPK() {
    }

    public ProductoTipoProductoPK(int idProducto, int idTipoProducto) {
        this.idProducto = idProducto;
        this.idTipoProducto = idTipoProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idProducto;
        hash += (int) idTipoProducto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoTipoProductoPK)) {
            return false;
        }
        ProductoTipoProductoPK other = (ProductoTipoProductoPK) object;
        if (this.idProducto != other.idProducto) {
            return false;
        }
        if (this.idTipoProducto != other.idTipoProducto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.ProductoTipoProductoPK[ idProducto=" + idProducto + ", idTipoProducto=" + idTipoProducto + " ]";
    }
    
}
