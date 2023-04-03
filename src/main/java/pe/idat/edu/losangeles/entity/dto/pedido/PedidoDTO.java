
package pe.idat.edu.losangeles.entity.dto.pedido;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.idat.edu.losangeles.entity.pedido.ClienteEntity;
import pe.idat.edu.losangeles.entity.pedido.EmpleadoEntity;

/**
 *
 * @author Sebastian
 */
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonPropertyOrder({"idpedido","idcliente","idempleado","fechapedido","estado"})
public class PedidoDTO {
    private Long idpedido;
    private ClienteEntity idcliente;
    private EmpleadoEntity idempleado;
    private String fechapedido;
    private boolean estado;
    
}
