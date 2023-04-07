package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Entrega;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T23:35:24")
@StaticMetamodel(Repartidor.class)
public class Repartidor_ { 

    public static volatile SingularAttribute<Repartidor, String> apellidos;
    public static volatile SingularAttribute<Repartidor, String> tipoLicencia;
    public static volatile SingularAttribute<Repartidor, Date> fechaNacimiento;
    public static volatile SingularAttribute<Repartidor, String> observaciones;
    public static volatile SingularAttribute<Repartidor, Long> idRepartidor;
    public static volatile CollectionAttribute<Repartidor, Entrega> entregaCollection;
    public static volatile SingularAttribute<Repartidor, String> nombres;
    public static volatile SingularAttribute<Repartidor, Boolean> activo;

}