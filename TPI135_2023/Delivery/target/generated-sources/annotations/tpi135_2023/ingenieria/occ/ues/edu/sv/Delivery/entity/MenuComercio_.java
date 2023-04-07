package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.OrdenDetalle;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ProductoComercio;

<<<<<<< HEAD
<<<<<<< HEAD:TPI135_2023/Delivery/target/generated-sources/annotations/tpi135_2023/ingenieria/occ/ues/edu/sv/Delivery/entity/MenuComercio_.java
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T17:09:55")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-04T01:49:49")
>>>>>>> b32f2cb848d989d681a5ed47ff292796cdce29e7:TPI135_2023/Delivery/target/generated-sources/annotations/tpi135_2023/ingenieria/occ/ues/edu/sv/Delivery/entity/MenuComercio_.java
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T17:09:55")
>>>>>>> MP19034
@StaticMetamodel(MenuComercio.class)
public class MenuComercio_ { 

    public static volatile SingularAttribute<MenuComercio, String> descripcion;
    public static volatile SingularAttribute<MenuComercio, ProductoComercio> productoComercio;
    public static volatile SingularAttribute<MenuComercio, BigDecimal> precioBase;
    public static volatile SingularAttribute<MenuComercio, Long> idMenu;
    public static volatile SingularAttribute<MenuComercio, String> nombre;
    public static volatile CollectionAttribute<MenuComercio, OrdenDetalle> ordenDetalleCollection;

}