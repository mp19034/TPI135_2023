/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author edwin
 */
@Entity
@Table(name = "orden_estado")
@NamedQueries({
    @NamedQuery(name = "OrdenEstado.findAll", query = "SELECT o FROM OrdenEstado o"),
    @NamedQuery(name = "OrdenEstado.findByIdOrdenEstado", query = "SELECT o FROM OrdenEstado o WHERE o.idOrdenEstado = :idOrdenEstado"),
    @NamedQuery(name = "OrdenEstado.findByEstado", query = "SELECT o FROM OrdenEstado o WHERE o.estado = :estado"),
    @NamedQuery(name = "OrdenEstado.findByFechaCreacion", query = "SELECT o FROM OrdenEstado o WHERE o.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "OrdenEstado.findByComentarios", query = "SELECT o FROM OrdenEstado o WHERE o.comentarios = :comentarios")})
public class OrdenEstado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_orden_estado")
    private Long idOrdenEstado;
    @Column(name = "estado")
    private String estado;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "comentarios")
    private String comentarios;
    @JoinColumn(name = "id_orden", referencedColumnName = "id_orden")
    @ManyToOne
    private Orden idOrden;

    public OrdenEstado() {
    }

    public OrdenEstado(Long idOrdenEstado) {
        this.idOrdenEstado = idOrdenEstado;
    }

    public Long getIdOrdenEstado() {
        return idOrdenEstado;
    }

    public void setIdOrdenEstado(Long idOrdenEstado) {
        this.idOrdenEstado = idOrdenEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Orden getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Orden idOrden) {
        this.idOrden = idOrden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdenEstado != null ? idOrdenEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenEstado)) {
            return false;
        }
        OrdenEstado other = (OrdenEstado) object;
        if ((this.idOrdenEstado == null && other.idOrdenEstado != null) || (this.idOrdenEstado != null && !this.idOrdenEstado.equals(other.idOrdenEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.OrdenEstado[ idOrdenEstado=" + idOrdenEstado + " ]";
    }
    
}
