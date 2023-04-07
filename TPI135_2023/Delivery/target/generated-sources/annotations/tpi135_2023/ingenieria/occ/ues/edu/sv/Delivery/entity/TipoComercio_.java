package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ComercioTipoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.TipoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.TipoProductoTipoComercio;

<<<<<<< HEAD
<<<<<<< HEAD:TPI135_2023/Delivery/target/generated-sources/annotations/tpi135_2023/ingenieria/occ/ues/edu/sv/Delivery/entity/TipoComercio_.java
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T17:09:55")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-04T01:49:49")
>>>>>>> b32f2cb848d989d681a5ed47ff292796cdce29e7:TPI135_2023/Delivery/target/generated-sources/annotations/tpi135_2023/ingenieria/occ/ues/edu/sv/Delivery/entity/TipoComercio_.java
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T17:09:55")
>>>>>>> MP19034
@StaticMetamodel(TipoComercio.class)
public class TipoComercio_ { 

    public static volatile SingularAttribute<TipoComercio, TipoComercio> idTipoComercioPadre;
    public static volatile CollectionAttribute<TipoComercio, TipoProductoTipoComercio> tipoProductoTipoComercioCollection;
    public static volatile CollectionAttribute<TipoComercio, ComercioTipoComercio> comercioTipoComercioCollection;
    public static volatile SingularAttribute<TipoComercio, Integer> idTipoComercio;
    public static volatile SingularAttribute<TipoComercio, String> nombre;
    public static volatile SingularAttribute<TipoComercio, String> comentarios;
    public static volatile SingularAttribute<TipoComercio, Boolean> activo;
    public static volatile CollectionAttribute<TipoComercio, TipoComercio> tipoComercioCollection;

}