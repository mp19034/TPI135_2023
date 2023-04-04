package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Comercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Orden;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-04T01:49:49")
@StaticMetamodel(Sucursal.class)
public class Sucursal_ { 

    public static volatile SingularAttribute<Sucursal, Integer> idSucursal;
    public static volatile SingularAttribute<Sucursal, String> pathLogo;
    public static volatile SingularAttribute<Sucursal, BigInteger> idDireccion;
    public static volatile SingularAttribute<Sucursal, Comercio> idComercio;
    public static volatile SingularAttribute<Sucursal, String> nombre;
    public static volatile CollectionAttribute<Sucursal, Orden> ordenCollection;

}