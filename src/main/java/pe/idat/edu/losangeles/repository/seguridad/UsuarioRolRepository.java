

package pe.idat.edu.losangeles.repository.seguridad;

import org.springframework.stereotype.Repository;
import pe.idat.edu.losangeles.entity.seguridad.UsuarioRolEntity;
import pe.idat.edu.losangeles.repository.generico.GenericoRepository;

/**
 *
 * @author Sebastian
 */
@Repository
public interface UsuarioRolRepository extends GenericoRepository<UsuarioRolEntity, Long>{
    
}
