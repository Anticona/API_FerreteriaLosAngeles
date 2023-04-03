
package pe.idat.edu.losangeles.entity.dto.pedido;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.idat.edu.losangeles.entity.pedido.PedidoEntity;
import pe.idat.edu.losangeles.entity.pedido.ProductoEntity;

/**
 *
 * @author Sebastian
 */
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonPropertyOrder({"iddetallepedido","idpedido","idproducto","cantidad","precio","estado"})
public class DetallePedidoDTO {
    private long iddetallepedido;
    private PedidoEntity idpedido;
    private ProductoEntity idproducto;
    private int cantidad;
    private double precio;
    private boolean estado;
}
