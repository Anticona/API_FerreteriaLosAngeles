
package pe.idat.edu.losangeles.entity.pedido;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.idat.edu.losangeles.entity.base.CantidadPrecioEntity;

/**
 *
 * @author Sebastian
 */
@SuperBuilder 
@NoArgsConstructor 
@AllArgsConstructor 
@Data
@EqualsAndHashCode(callSuper = false)
@Entity(name="DetallePedidoEntity") 
@Table(name="detallepedido") 
public class DetallePedidoEntity extends CantidadPrecioEntity implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="iddetallepedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iddetallepedido;
    
    @ManyToOne
    @JoinColumn(name="idproducto", nullable = false)
    private ProductoEntity idproducto;
    
    @ManyToOne
    @JoinColumn(name="idpedido", nullable = false)
    private PedidoEntity idpedido;

}
