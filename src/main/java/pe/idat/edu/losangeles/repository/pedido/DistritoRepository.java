

package pe.idat.edu.losangeles.repository.pedido;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.idat.edu.losangeles.entity.pedido.DistritoEntity;
import pe.idat.edu.losangeles.repository.generico.GenericoRepository;

/**
 *
 * @author Sebastian
 */
@Repository
public interface DistritoRepository extends GenericoRepository<DistritoEntity, Long>{
    @Query("select d from DistritoEntity d where d.estado=1")
    List<DistritoEntity> findAllCustom();
}
