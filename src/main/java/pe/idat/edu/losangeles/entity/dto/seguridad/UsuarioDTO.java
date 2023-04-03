
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
@JsonPropertyOrder({"idusuario","user","password","estado"})
public class UsuarioDTO {
    private Long idusuario;
    private String user;
    private String password;
    private boolean estado;
}
