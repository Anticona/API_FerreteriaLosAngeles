

package pe.idat.edu.losangeles.repository.pedido;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.idat.edu.losangeles.entity.pedido.EmpleadoEntity;
import pe.idat.edu.losangeles.repository.generico.GenericoRepository;

/**
 *
 * @author Sebastian
 */
@Repository
public interface EmpleadoRepository extends GenericoRepository<EmpleadoEntity, Long>{
    @Query("select e from EmpleadoEntity e where e.estado=1")
    List<EmpleadoEntity> findAllCustom();
}
