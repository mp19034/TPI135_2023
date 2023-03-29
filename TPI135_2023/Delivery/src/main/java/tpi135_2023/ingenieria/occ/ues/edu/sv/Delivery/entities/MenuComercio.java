/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author edwin
 */
@Entity
@Table(name = "menu_comercio")
@NamedQueries({
    @NamedQuery(name = "MenuComercio.findAll", query = "SELECT m FROM MenuComercio m"),
    @NamedQuery(name = "MenuComercio.findByIdMenu", query = "SELECT m FROM MenuComercio m WHERE m.idMenu = :idMenu"),
    @NamedQuery(name = "MenuComercio.findByNombre", query = "SELECT m FROM MenuComercio m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "MenuComercio.findByDescripcion", query = "SELECT m FROM MenuComercio m WHERE m.descripcion = :descripcion"),
    @NamedQuery(name = "MenuComercio.findByPrecioBase", query = "SELECT m FROM MenuComercio m WHERE m.precioBase = :precioBase")})
public class MenuComercio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_menu")
    private Long idMenu;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_base")
    private BigDecimal precioBase;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "menuComercio")
    private Collection<OrdenDetalle> ordenDetalleCollection;
    @JoinColumns({
        @JoinColumn(name = "id_comercio", referencedColumnName = "id_comercio"),
        @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")})
    @ManyToOne
    private ProductoComercio productoComercio;

    public MenuComercio() {
    }

    public MenuComercio(Long idMenu) {
        this.idMenu = idMenu;
    }

    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(BigDecimal precioBase) {
        this.precioBase = precioBase;
    }

    public Collection<OrdenDetalle> getOrdenDetalleCollection() {
        return ordenDetalleCollection;
    }

    public void setOrdenDetalleCollection(Collection<OrdenDetalle> ordenDetalleCollection) {
        this.ordenDetalleCollection = ordenDetalleCollection;
    }

    public ProductoComercio getProductoComercio() {
        return productoComercio;
    }

    public void setProductoComercio(ProductoComercio productoComercio) {
        this.productoComercio = productoComercio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMenu != null ? idMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MenuComercio)) {
            return false;
        }
        MenuComercio other = (MenuComercio) object;
        if ((this.idMenu == null && other.idMenu != null) || (this.idMenu != null && !this.idMenu.equals(other.idMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.MenuComercio[ idMenu=" + idMenu + " ]";
    }
    
}
