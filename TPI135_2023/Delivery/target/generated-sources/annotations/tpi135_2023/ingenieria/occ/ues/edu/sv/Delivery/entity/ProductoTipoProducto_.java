package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Producto;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ProductoTipoProductoPK;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.TipoProducto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T23:35:24")
@StaticMetamodel(ProductoTipoProducto.class)
public class ProductoTipoProducto_ { 

    public static volatile SingularAttribute<ProductoTipoProducto, TipoProducto> tipoProducto;
    public static volatile SingularAttribute<ProductoTipoProducto, ProductoTipoProductoPK> productoTipoProductoPK;
    public static volatile SingularAttribute<ProductoTipoProducto, Date> fechaCreacion;
    public static volatile SingularAttribute<ProductoTipoProducto, Producto> producto;
    public static volatile SingularAttribute<ProductoTipoProducto, Boolean> activo;

}