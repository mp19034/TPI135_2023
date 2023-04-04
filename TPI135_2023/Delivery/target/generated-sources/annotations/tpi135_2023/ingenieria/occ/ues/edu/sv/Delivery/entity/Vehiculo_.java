package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Entrega;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-04T01:49:49")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, Long> idVehiculo;
    public static volatile SingularAttribute<Vehiculo, String> propietario;
    public static volatile CollectionAttribute<Vehiculo, Entrega> entregaCollection;
    public static volatile SingularAttribute<Vehiculo, String> tipoVehiculo;
    public static volatile SingularAttribute<Vehiculo, String> comentarios;
    public static volatile SingularAttribute<Vehiculo, String> placa;
    public static volatile SingularAttribute<Vehiculo, Boolean> activo;

}