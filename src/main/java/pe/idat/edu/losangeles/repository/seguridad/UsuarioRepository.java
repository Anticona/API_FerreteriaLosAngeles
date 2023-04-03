

package pe.idat.edu.losangeles.repository.seguridad;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.losangeles.entity.seguridad.UsuarioEntity;
import pe.idat.edu.losangeles.repository.generico.GenericoRepository;

/**
 *
 * @author Sebastian
 */
public interface UsuarioRepository extends GenericoRepository<UsuarioEntity, Long>{
    @Query("select u from UsuarioEntity u where u.estado=1")
    List<UsuarioEntity> findAllCustom();
}
