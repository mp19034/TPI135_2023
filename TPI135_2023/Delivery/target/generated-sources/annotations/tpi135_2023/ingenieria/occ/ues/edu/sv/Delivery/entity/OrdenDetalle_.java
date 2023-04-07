package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.MenuComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Orden;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.OrdenDetallePK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T23:35:24")
@StaticMetamodel(OrdenDetalle.class)
public class OrdenDetalle_ { 

    public static volatile SingularAttribute<OrdenDetalle, MenuComercio> menuComercio;
    public static volatile SingularAttribute<OrdenDetalle, BigDecimal> precio;
    public static volatile SingularAttribute<OrdenDetalle, String> observaciones;
    public static volatile SingularAttribute<OrdenDetalle, OrdenDetallePK> ordenDetallePK;
    public static volatile SingularAttribute<OrdenDetalle, BigDecimal> cantidad;
    public static volatile SingularAttribute<OrdenDetalle, Orden> orden;

}