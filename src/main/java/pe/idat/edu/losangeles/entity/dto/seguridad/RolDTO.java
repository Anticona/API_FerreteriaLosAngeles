
package pe.idat.edu.losangeles.entity.dto.seguridad;

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
@JsonPropertyOrder({"idrol","nombre","estado"})
public class RolDTO {
    private Long idrol;
    private String nombre;
    private boolean estado; 
}
