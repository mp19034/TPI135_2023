package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Orden;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Pago;

<<<<<<< HEAD:TPI135_2023/Delivery/target/generated-sources/annotations/tpi135_2023/ingenieria/occ/ues/edu/sv/Delivery/entity/Factura_.java
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T17:09:55")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-04T01:49:49")
>>>>>>> b32f2cb848d989d681a5ed47ff292796cdce29e7:TPI135_2023/Delivery/target/generated-sources/annotations/tpi135_2023/ingenieria/occ/ues/edu/sv/Delivery/entity/Factura_.java
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, String> observaciones;
    public static volatile SingularAttribute<Factura, String> numeroFactura;
    public static volatile SingularAttribute<Factura, Date> fechaEmision;
    public static volatile SingularAttribute<Factura, Boolean> anulada;
    public static volatile SingularAttribute<Factura, Orden> idOrden;
    public static volatile CollectionAttribute<Factura, Pago> pagoCollection;

}