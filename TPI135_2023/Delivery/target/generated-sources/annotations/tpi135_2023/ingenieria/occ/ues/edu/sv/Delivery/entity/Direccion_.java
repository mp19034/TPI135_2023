package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Territorio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T23:08:26")
@StaticMetamodel(Direccion.class)
public class Direccion_ { 

    public static volatile SingularAttribute<Direccion, Long> idDireccion;
    public static volatile SingularAttribute<Direccion, BigDecimal> longitud;
    public static volatile SingularAttribute<Direccion, BigDecimal> latitud;
    public static volatile SingularAttribute<Direccion, String> direccion;
    public static volatile SingularAttribute<Direccion, String> referencias;
    public static volatile SingularAttribute<Direccion, Territorio> idTerritorio;

}