package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ComercioTipoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.TipoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.TipoProductoTipoComercio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-06T23:08:26")
@StaticMetamodel(TipoComercio.class)
public class TipoComercio_ { 

    public static volatile SingularAttribute<TipoComercio, TipoComercio> idTipoComercioPadre;
    public static volatile CollectionAttribute<TipoComercio, TipoProductoTipoComercio> tipoProductoTipoComercioCollection;
    public static volatile CollectionAttribute<TipoComercio, ComercioTipoComercio> comercioTipoComercioCollection;
    public static volatile SingularAttribute<TipoComercio, Integer> idTipoComercio;
    public static volatile SingularAttribute<TipoComercio, String> nombre;
    public static volatile SingularAttribute<TipoComercio, String> comentarios;
    public static volatile SingularAttribute<TipoComercio, Boolean> activo;
    public static volatile CollectionAttribute<TipoComercio, TipoComercio> tipoComercioCollection;

}