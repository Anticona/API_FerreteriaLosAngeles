

package pe.idat.edu.losangeles.repository.seguridad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.losangeles.entity.seguridad.RolEntity;


/**
 *
 * @author Sebastian
 */

public interface RolRepository extends JpaRepository<RolEntity, Long>{
    @Query("select r from RolEntity r where r.estado=1")
    List<RolEntity> findAllCustom();
}
