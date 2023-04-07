package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ProductoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ProductoTipoProducto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T23:35:24")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile CollectionAttribute<Producto, ProductoComercio> productoComercioCollection;
    public static volatile CollectionAttribute<Producto, ProductoTipoProducto> productoTipoProductoCollection;
    public static volatile SingularAttribute<Producto, Integer> idProducto;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile SingularAttribute<Producto, Boolean> activo;

}