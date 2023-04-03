
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
@JsonPropertyOrder({"idcategoria","nombre","estado"})
public class CategoriaDTO{
    private long idcategoria;
    private String nombre;
    private boolean estado;
}
