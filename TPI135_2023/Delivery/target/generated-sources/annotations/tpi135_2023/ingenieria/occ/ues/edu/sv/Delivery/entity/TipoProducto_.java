package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ProductoTipoProducto;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.TipoProducto;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.TipoProductoTipoComercio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T17:09:55")
@StaticMetamodel(TipoProducto.class)
public class TipoProducto_ { 

    public static volatile CollectionAttribute<TipoProducto, TipoProductoTipoComercio> tipoProductoTipoComercioCollection;
    public static volatile CollectionAttribute<TipoProducto, ProductoTipoProducto> productoTipoProductoCollection;
    public static volatile SingularAttribute<TipoProducto, TipoProducto> idTipoProductoPadre;
    public static volatile SingularAttribute<TipoProducto, String> nombre;
    public static volatile SingularAttribute<TipoProducto, String> comentarios;
    public static volatile SingularAttribute<TipoProducto, Integer> idTipoProducto;
    public static volatile CollectionAttribute<TipoProducto, TipoProducto> tipoProductoCollection;
    public static volatile SingularAttribute<TipoProducto, Boolean> activo;

}