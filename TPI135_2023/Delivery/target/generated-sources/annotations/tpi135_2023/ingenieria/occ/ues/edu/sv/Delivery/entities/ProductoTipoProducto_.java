package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.Producto;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.ProductoTipoProductoPK;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.TipoProducto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-29T16:36:13")
@StaticMetamodel(ProductoTipoProducto.class)
public class ProductoTipoProducto_ { 

    public static volatile SingularAttribute<ProductoTipoProducto, TipoProducto> tipoProducto;
    public static volatile SingularAttribute<ProductoTipoProducto, ProductoTipoProductoPK> productoTipoProductoPK;
    public static volatile SingularAttribute<ProductoTipoProducto, Date> fechaCreacion;
    public static volatile SingularAttribute<ProductoTipoProducto, Producto> producto;
    public static volatile SingularAttribute<ProductoTipoProducto, Boolean> activo;

}