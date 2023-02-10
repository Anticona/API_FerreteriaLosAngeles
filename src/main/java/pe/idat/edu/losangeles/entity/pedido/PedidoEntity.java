
package pe.idat.edu.losangeles.entity.pedido;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.idat.edu.losangeles.entity.base.EstadoEntity;

/**
 *
 * @author Sebastian
 */
@SuperBuilder 
@NoArgsConstructor 
@AllArgsConstructor 
@Data
@EqualsAndHashCode(callSuper = false)
@Entity(name="PedidoEntity") 
@Table(name="pedido") 
public class PedidoEntity extends EstadoEntity implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="idpedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idpedido;
    @Column(name="fechapedido",length = 10,nullable = false)
    @NotEmpty(message = "Debe de ingresar la fecha de pedido")
    private String fechapedido;
    
    @ManyToOne
    @JoinColumn(name="idcliente", nullable = false)
    private ClienteEntity idcliente;
    
    @ManyToOne
    @JoinColumn(name="idempleado", nullable = false)
    private EmpleadoEntity idempleado;
    
}
