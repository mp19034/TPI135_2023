package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.MenuComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.Orden;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.OrdenDetallePK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-29T16:36:13")
@StaticMetamodel(OrdenDetalle.class)
public class OrdenDetalle_ { 

    public static volatile SingularAttribute<OrdenDetalle, MenuComercio> menuComercio;
    public static volatile SingularAttribute<OrdenDetalle, BigDecimal> precio;
    public static volatile SingularAttribute<OrdenDetalle, String> observaciones;
    public static volatile SingularAttribute<OrdenDetalle, OrdenDetallePK> ordenDetallePK;
    public static volatile SingularAttribute<OrdenDetalle, BigDecimal> cantidad;
    public static volatile SingularAttribute<OrdenDetalle, Orden> orden;

}