package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.ComercioTipoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.ProductoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.Sucursal;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-29T16:36:13")
@StaticMetamodel(Comercio.class)
public class Comercio_ { 

    public static volatile SingularAttribute<Comercio, String> descripcion;
    public static volatile CollectionAttribute<Comercio, ComercioTipoComercio> comercioTipoComercioCollection;
    public static volatile CollectionAttribute<Comercio, Sucursal> sucursalCollection;
    public static volatile SingularAttribute<Comercio, Long> idComercio;
    public static volatile CollectionAttribute<Comercio, ProductoComercio> productoComercioCollection;
    public static volatile SingularAttribute<Comercio, String> nombre;
    public static volatile SingularAttribute<Comercio, Boolean> activo;

}