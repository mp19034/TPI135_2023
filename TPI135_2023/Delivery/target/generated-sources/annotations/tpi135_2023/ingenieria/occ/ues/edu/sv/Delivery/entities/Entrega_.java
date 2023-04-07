package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.EntregaHistorial;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.Orden;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.Repartidor;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.Vehiculo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-29T16:36:13")
@StaticMetamodel(Entrega.class)
public class Entrega_ { 

    public static volatile SingularAttribute<Entrega, Vehiculo> idVehiculo;
    public static volatile SingularAttribute<Entrega, String> observaciones;
    public static volatile SingularAttribute<Entrega, Date> fechaCreacion;
    public static volatile SingularAttribute<Entrega, Repartidor> idRepartidor;
    public static volatile CollectionAttribute<Entrega, EntregaHistorial> entregaHistorialCollection;
    public static volatile SingularAttribute<Entrega, Orden> idOrden;
    public static volatile SingularAttribute<Entrega, Long> idEntrega;

}