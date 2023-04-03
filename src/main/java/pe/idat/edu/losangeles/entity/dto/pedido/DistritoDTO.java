
package pe.idat.edu.losangeles.entity.dto.pedido;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author Sebastian
 */
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonPropertyOrder({"iddistrito","nombre","estado"})
public class DistritoDTO {
    private Long iddistrito;
    private String nombre;
    private boolean estado;

}
