package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.OrdenDetalle;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.ProductoComercio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-29T16:36:13")
@StaticMetamodel(MenuComercio.class)
public class MenuComercio_ { 

    public static volatile SingularAttribute<MenuComercio, String> descripcion;
    public static volatile SingularAttribute<MenuComercio, ProductoComercio> productoComercio;
    public static volatile SingularAttribute<MenuComercio, BigDecimal> precioBase;
    public static volatile SingularAttribute<MenuComercio, Long> idMenu;
    public static volatile SingularAttribute<MenuComercio, String> nombre;
    public static volatile CollectionAttribute<MenuComercio, OrdenDetalle> ordenDetalleCollection;

}