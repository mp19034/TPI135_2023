package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Comercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ComercioTipoComercioPK;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.TipoComercio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T17:09:55")
@StaticMetamodel(ComercioTipoComercio.class)
public class ComercioTipoComercio_ { 

    public static volatile SingularAttribute<ComercioTipoComercio, ComercioTipoComercioPK> comercioTipoComercioPK;
    public static volatile SingularAttribute<ComercioTipoComercio, Comercio> comercio;
    public static volatile SingularAttribute<ComercioTipoComercio, Date> fechaCreacion;
    public static volatile SingularAttribute<ComercioTipoComercio, TipoComercio> tipoComercio;
    public static volatile SingularAttribute<ComercioTipoComercio, Boolean> activo;

}