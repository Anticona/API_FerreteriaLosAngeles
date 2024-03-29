

package pe.idat.edu.losangeles.repository.pedido;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.idat.edu.losangeles.entity.pedido.MarcaEntity;
import pe.idat.edu.losangeles.repository.generico.GenericoRepository;

/**
 *
 * @author Sebastian
 */
@Repository
public interface MarcaRepository extends GenericoRepository<MarcaEntity, Long>{
    @Query("select m from MarcaEntity m where m.estado=1")
    List<MarcaEntity> findAllCustom();
}
