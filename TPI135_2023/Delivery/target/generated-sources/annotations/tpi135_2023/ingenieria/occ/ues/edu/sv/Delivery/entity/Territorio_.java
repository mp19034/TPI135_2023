package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Direccion;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Territorio;

<<<<<<< HEAD
<<<<<<< HEAD:TPI135_2023/Delivery/target/generated-sources/annotations/tpi135_2023/ingenieria/occ/ues/edu/sv/Delivery/entity/Territorio_.java
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T17:09:55")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-04T01:49:49")
>>>>>>> b32f2cb848d989d681a5ed47ff292796cdce29e7:TPI135_2023/Delivery/target/generated-sources/annotations/tpi135_2023/ingenieria/occ/ues/edu/sv/Delivery/entity/Territorio_.java
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T17:09:55")
>>>>>>> MP19034
@StaticMetamodel(Territorio.class)
public class Territorio_ { 

    public static volatile SingularAttribute<Territorio, String> textoVisible;
    public static volatile SingularAttribute<Territorio, Integer> hijosObligatorios;
    public static volatile SingularAttribute<Territorio, Territorio> idTerritorioPadre;
    public static volatile CollectionAttribute<Territorio, Territorio> territorioCollection;
    public static volatile SingularAttribute<Territorio, Integer> idTerritorio;
    public static volatile CollectionAttribute<Territorio, Direccion> direccionCollection;
    public static volatile SingularAttribute<Territorio, String> nombre;

}