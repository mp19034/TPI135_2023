package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Cliente;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Entrega;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Factura;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.OrdenDetalle;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.OrdenEstado;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Sucursal;

<<<<<<< HEAD
<<<<<<< HEAD:TPI135_2023/Delivery/target/generated-sources/annotations/tpi135_2023/ingenieria/occ/ues/edu/sv/Delivery/entity/Orden_.java
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T17:09:55")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-04T01:49:49")
>>>>>>> b32f2cb848d989d681a5ed47ff292796cdce29e7:TPI135_2023/Delivery/target/generated-sources/annotations/tpi135_2023/ingenieria/occ/ues/edu/sv/Delivery/entity/Orden_.java
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T17:09:55")
>>>>>>> MP19034
@StaticMetamodel(Orden.class)
public class Orden_ { 

    public static volatile SingularAttribute<Orden, Sucursal> idSucursal;
    public static volatile SingularAttribute<Orden, BigInteger> idDireccion;
    public static volatile SingularAttribute<Orden, Cliente> idCliente;
    public static volatile CollectionAttribute<Orden, OrdenEstado> ordenEstadoCollection;
    public static volatile SingularAttribute<Orden, String> observaciones;
    public static volatile CollectionAttribute<Orden, Entrega> entregaCollection;
    public static volatile SingularAttribute<Orden, Long> idOrden;
    public static volatile SingularAttribute<Orden, Date> fechaOrden;
    public static volatile CollectionAttribute<Orden, OrdenDetalle> ordenDetalleCollection;
    public static volatile CollectionAttribute<Orden, Factura> facturaCollection;

}