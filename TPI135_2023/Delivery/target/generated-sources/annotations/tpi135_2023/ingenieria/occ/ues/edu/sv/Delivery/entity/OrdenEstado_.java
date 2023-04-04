package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Orden;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-04T01:49:49")
@StaticMetamodel(OrdenEstado.class)
public class OrdenEstado_ { 

    public static volatile SingularAttribute<OrdenEstado, String> estado;
    public static volatile SingularAttribute<OrdenEstado, Long> idOrdenEstado;
    public static volatile SingularAttribute<OrdenEstado, Date> fechaCreacion;
    public static volatile SingularAttribute<OrdenEstado, String> comentarios;
    public static volatile SingularAttribute<OrdenEstado, Orden> idOrden;

}