

package pe.idat.edu.losangeles.repository.pedido;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.losangeles.entity.pedido.UsuarioRolEntity;

/**
 *
 * @author Sebastian
 */
public interface UsuarioRolRepository extends JpaRepository<UsuarioRolEntity, Long>{
    
}
