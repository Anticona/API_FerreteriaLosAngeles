
package pe.idat.edu.losangeles.entity.dto.seguridad;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.idat.edu.losangeles.entity.seguridad.RolEntity;
import pe.idat.edu.losangeles.entity.seguridad.UsuarioEntity;

/**
 *
 * @author Sebastian
 */
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonPropertyOrder({"idusuariorol","idusuario","idrol"})
public class UsuarioRolDTO {
    private long idusuariorol;
    private UsuarioEntity idusuario;
    private RolEntity idrol;
}
