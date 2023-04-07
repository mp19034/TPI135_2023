/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "entrega_historial")
@NamedQueries({
    @NamedQuery(name = "EntregaHistorial.findAll", query = "SELECT e FROM EntregaHistorial e"),
    @NamedQuery(name = "EntregaHistorial.findByIdEntregaHistorial", query = "SELECT e FROM EntregaHistorial e WHERE e.idEntregaHistorial = :idEntregaHistorial"),
    @NamedQuery(name = "EntregaHistorial.findByEstadoEntrega", query = "SELECT e FROM EntregaHistorial e WHERE e.estadoEntrega = :estadoEntrega"),
    @NamedQuery(name = "EntregaHistorial.findByFechaAlcanzado", query = "SELECT e FROM EntregaHistorial e WHERE e.fechaAlcanzado = :fechaAlcanzado"),
    @NamedQuery(name = "EntregaHistorial.findByLongitud", query = "SELECT e FROM EntregaHistorial e WHERE e.longitud = :longitud"),
    @NamedQuery(name = "EntregaHistorial.findByLatitud", query = "SELECT e FROM EntregaHistorial e WHERE e.latitud = :latitud"),
    @NamedQuery(name = "EntregaHistorial.findByObservaciones", query = "SELECT e FROM EntregaHistorial e WHERE e.observaciones = :observaciones")})
public class EntregaHistorial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_entrega_historial")
    private Long idEntregaHistorial;
    @Column(name = "estado_entrega")
    private String estadoEntrega;
    @Column(name = "fecha_alcanzado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlcanzado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "longitud")
    private BigDecimal longitud;
    @Column(name = "latitud")
    private BigDecimal latitud;
    @Column(name = "observaciones")
    private String observaciones;
    @JoinColumn(name = "id_entrega", referencedColumnName = "id_entrega")
    @ManyToOne
    private Entrega idEntrega;

    public EntregaHistorial() {
    }

    public EntregaHistorial(Long idEntregaHistorial) {
        this.idEntregaHistorial = idEntregaHistorial;
    }

    public Long getIdEntregaHistorial() {
        return idEntregaHistorial;
    }

    public void setIdEntregaHistorial(Long idEntregaHistorial) {
        this.idEntregaHistorial = idEntregaHistorial;
    }

    public String getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(String estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }

    public Date getFechaAlcanzado() {
        return fechaAlcanzado;
    }

    public void setFechaAlcanzado(Date fechaAlcanzado) {
        this.fechaAlcanzado = fechaAlcanzado;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Entrega getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(Entrega idEntrega) {
        this.idEntrega = idEntrega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntregaHistorial != null ? idEntregaHistorial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntregaHistorial)) {
            return false;
        }
        EntregaHistorial other = (EntregaHistorial) object;
        if ((this.idEntregaHistorial == null && other.idEntregaHistorial != null) || (this.idEntregaHistorial != null && !this.idEntregaHistorial.equals(other.idEntregaHistorial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.EntregaHistorial[ idEntregaHistorial=" + idEntregaHistorial + " ]";
    }
    
}
