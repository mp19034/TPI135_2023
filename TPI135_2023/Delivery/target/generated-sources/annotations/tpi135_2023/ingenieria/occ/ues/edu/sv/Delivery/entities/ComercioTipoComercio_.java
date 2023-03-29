package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.Comercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.ComercioTipoComercioPK;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entities.TipoComercio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-29T16:36:13")
@StaticMetamodel(ComercioTipoComercio.class)
public class ComercioTipoComercio_ { 

    public static volatile SingularAttribute<ComercioTipoComercio, ComercioTipoComercioPK> comercioTipoComercioPK;
    public static volatile SingularAttribute<ComercioTipoComercio, Comercio> comercio;
    public static volatile SingularAttribute<ComercioTipoComercio, Date> fechaCreacion;
    public static volatile SingularAttribute<ComercioTipoComercio, TipoComercio> tipoComercio;
    public static volatile SingularAttribute<ComercioTipoComercio, Boolean> activo;

}