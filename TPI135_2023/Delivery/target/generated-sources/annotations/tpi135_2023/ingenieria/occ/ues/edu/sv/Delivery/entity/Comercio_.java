package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ComercioTipoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ProductoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Sucursal;

<<<<<<< HEAD:TPI135_2023/Delivery/target/generated-sources/annotations/tpi135_2023/ingenieria/occ/ues/edu/sv/Delivery/entity/Comercio_.java
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T17:09:55")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-04T01:49:49")
>>>>>>> b32f2cb848d989d681a5ed47ff292796cdce29e7:TPI135_2023/Delivery/target/generated-sources/annotations/tpi135_2023/ingenieria/occ/ues/edu/sv/Delivery/entity/Comercio_.java
@StaticMetamodel(Comercio.class)
public class Comercio_ { 

    public static volatile SingularAttribute<Comercio, String> descripcion;
    public static volatile CollectionAttribute<Comercio, ComercioTipoComercio> comercioTipoComercioCollection;
    public static volatile CollectionAttribute<Comercio, Sucursal> sucursalCollection;
    public static volatile SingularAttribute<Comercio, Long> idComercio;
    public static volatile CollectionAttribute<Comercio, ProductoComercio> productoComercioCollection;
    public static volatile SingularAttribute<Comercio, String> nombre;
    public static volatile SingularAttribute<Comercio, Boolean> activo;

}