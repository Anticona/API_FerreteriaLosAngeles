

package pe.idat.edu.losangeles.service.pedido;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.losangeles.entity.pedido.UsuarioRolEntity;

/**
 *
 * @author Sebastian
 */
public interface UsuarioRolService {
    List<UsuarioRolEntity> findAll();
    UsuarioRolEntity add(UsuarioRolEntity u);
    Optional<UsuarioRolEntity> findById(Long id);
    UsuarioRolEntity update(UsuarioRolEntity u);
}
