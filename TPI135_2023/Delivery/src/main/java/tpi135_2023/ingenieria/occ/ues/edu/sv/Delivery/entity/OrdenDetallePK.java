/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author edwin
 */
@Embeddable
public class OrdenDetallePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_orden")
    private long idOrden;
    @Basic(optional = false)
    @Column(name = "id_menu")
    private long idMenu;

    public OrdenDetallePK() {
    }

    public OrdenDetallePK(long idOrden, long idMenu) {
        this.idOrden = idOrden;
        this.idMenu = idMenu;
    }

    public long getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(long idOrden) {
        this.idOrden = idOrden;
    }

    public long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(long idMenu) {
        this.idMenu = idMenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idOrden;
        hash += (int) idMenu;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenDetallePK)) {
            return false;
        }
        OrdenDetallePK other = (OrdenDetallePK) object;
        if (this.idOrden != other.idOrden) {
            return false;
        }
        if (this.idMenu != other.idMenu) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.OrdenDetallePK[ idOrden=" + idOrden + ", idMenu=" + idMenu + " ]";
    }
    
}
