package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Orden;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T17:09:55")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> apellidos;
    public static volatile SingularAttribute<Cliente, BigInteger> idDireccionActual;
    public static volatile SingularAttribute<Cliente, Long> idCliente;
    public static volatile SingularAttribute<Cliente, Date> fechaNacimiento;
    public static volatile SingularAttribute<Cliente, String> nombres;
    public static volatile CollectionAttribute<Cliente, Orden> ordenCollection;

}