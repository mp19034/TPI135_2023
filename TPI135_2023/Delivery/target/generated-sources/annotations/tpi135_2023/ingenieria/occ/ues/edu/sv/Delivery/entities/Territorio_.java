package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.Direccion;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.Territorio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-29T16:36:13")
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