package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.Orden;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.Pago;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-29T16:36:13")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, String> observaciones;
    public static volatile SingularAttribute<Factura, String> numeroFactura;
    public static volatile SingularAttribute<Factura, Date> fechaEmision;
    public static volatile SingularAttribute<Factura, Boolean> anulada;
    public static volatile SingularAttribute<Factura, Orden> idOrden;
    public static volatile CollectionAttribute<Factura, Pago> pagoCollection;

}