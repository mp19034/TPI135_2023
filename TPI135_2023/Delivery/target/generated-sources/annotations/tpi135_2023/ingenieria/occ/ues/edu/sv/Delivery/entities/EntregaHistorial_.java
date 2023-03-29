package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.Entrega;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-29T16:36:13")
@StaticMetamodel(EntregaHistorial.class)
public class EntregaHistorial_ { 

    public static volatile SingularAttribute<EntregaHistorial, BigDecimal> longitud;
    public static volatile SingularAttribute<EntregaHistorial, BigDecimal> latitud;
    public static volatile SingularAttribute<EntregaHistorial, Long> idEntregaHistorial;
    public static volatile SingularAttribute<EntregaHistorial, String> observaciones;
    public static volatile SingularAttribute<EntregaHistorial, String> estadoEntrega;
    public static volatile SingularAttribute<EntregaHistorial, Date> fechaAlcanzado;
    public static volatile SingularAttribute<EntregaHistorial, Entrega> idEntrega;

}