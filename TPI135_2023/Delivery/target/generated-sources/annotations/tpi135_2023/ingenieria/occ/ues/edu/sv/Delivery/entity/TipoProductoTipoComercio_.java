package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.TipoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.TipoProducto;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.TipoProductoTipoComercioPK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T23:35:25")
@StaticMetamodel(TipoProductoTipoComercio.class)
public class TipoProductoTipoComercio_ { 

    public static volatile SingularAttribute<TipoProductoTipoComercio, TipoProducto> tipoProducto;
    public static volatile SingularAttribute<TipoProductoTipoComercio, Date> fechaCreacion;
    public static volatile SingularAttribute<TipoProductoTipoComercio, TipoProductoTipoComercioPK> tipoProductoTipoComercioPK;
    public static volatile SingularAttribute<TipoProductoTipoComercio, TipoComercio> tipoComercio;
    public static volatile SingularAttribute<TipoProductoTipoComercio, Boolean> activo;

}