

package pe.idat.edu.losangeles.repository.seguridad;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.idat.edu.losangeles.entity.seguridad.RolEntity;
import pe.idat.edu.losangeles.repository.generico.GenericoRepository;


/**
 *
 * @author Sebastian
 */
@Repository
public interface RolRepository extends GenericoRepository<RolEntity, Long>{
    @Query("select r from RolEntity r where r.estado=1")
    List<RolEntity> findAllCustom();
}
