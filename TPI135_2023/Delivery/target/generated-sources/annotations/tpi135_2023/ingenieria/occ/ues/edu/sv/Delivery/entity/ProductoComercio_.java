package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Comercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.MenuComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Producto;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ProductoComercioPK;

<<<<<<< HEAD
<<<<<<< HEAD:TPI135_2023/Delivery/target/generated-sources/annotations/tpi135_2023/ingenieria/occ/ues/edu/sv/Delivery/entity/ProductoComercio_.java
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T17:09:55")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-04T01:49:49")
>>>>>>> b32f2cb848d989d681a5ed47ff292796cdce29e7:TPI135_2023/Delivery/target/generated-sources/annotations/tpi135_2023/ingenieria/occ/ues/edu/sv/Delivery/entity/ProductoComercio_.java
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T17:09:55")
>>>>>>> MP19034
@StaticMetamodel(ProductoComercio.class)
public class ProductoComercio_ { 

    public static volatile SingularAttribute<ProductoComercio, ProductoComercioPK> productoComercioPK;
    public static volatile SingularAttribute<ProductoComercio, Comercio> comercio;
    public static volatile SingularAttribute<ProductoComercio, Date> fechaCreacion;
    public static volatile CollectionAttribute<ProductoComercio, MenuComercio> menuComercioCollection;
    public static volatile SingularAttribute<ProductoComercio, Producto> producto;
    public static volatile SingularAttribute<ProductoComercio, Boolean> activo;

}