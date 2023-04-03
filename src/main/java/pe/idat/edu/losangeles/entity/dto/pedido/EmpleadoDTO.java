
package pe.idat.edu.losangeles.entity.dto.pedido;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.idat.edu.losangeles.entity.seguridad.UsuarioEntity;

/**
 *
 * @author Sebastian
 */
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonPropertyOrder({"idempleado","prnombre","sgnombre","ptapellido","mtapellido","email","dni","estado","idusuario"})
public class EmpleadoDTO {
    private long idempleado;
    private String prnombre;
    private String sgnombre;
    private String ptapellido;
    private String mtapellido;
    private String email;
    private int dni;
    private boolean estado;
    private UsuarioEntity idusuario;
}
