

package pe.idat.edu.losangeles.repository.seguridad;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.idat.edu.losangeles.entity.seguridad.UsuarioRolEntity;

/**
 *
 * @author Sebastian
 */
public interface UsuarioRolRepository extends JpaRepository<UsuarioRolEntity, Long>{
    
}
