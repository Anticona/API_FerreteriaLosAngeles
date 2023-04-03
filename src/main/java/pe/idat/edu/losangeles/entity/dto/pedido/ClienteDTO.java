
package pe.idat.edu.losangeles.entity.dto.pedido;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.idat.edu.losangeles.entity.pedido.DistritoEntity;
import pe.idat.edu.losangeles.entity.seguridad.UsuarioEntity;

/**
 *
 * @author Sebastian
 */
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonPropertyOrder({"idcliente","prnombre","sgnombre","ptapellido","mtapellido","dni","email","estado","iddistrito","idusuario"})
public class ClienteDTO {
    
    private long idcliente;
    private String prnombre;
    private String sgnombre;
    private String ptapellido;
    private String mtapellido;
    private String email;
    private int dni;
    private boolean estado;
    private DistritoEntity iddistrito;
    private UsuarioEntity idusuario;
}
