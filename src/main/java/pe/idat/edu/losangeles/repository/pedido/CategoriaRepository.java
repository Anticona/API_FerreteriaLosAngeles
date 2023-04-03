

package pe.idat.edu.losangeles.repository.pedido;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.idat.edu.losangeles.entity.pedido.CategoriaEntity;
import pe.idat.edu.losangeles.repository.generico.GenericoRepository;

/**
 *
 * @author Sebastian
 */
@Repository
public interface CategoriaRepository extends GenericoRepository<CategoriaEntity, Long>{
    @Query("select c from CategoriaEntity c where c.estado=1")
    List<CategoriaEntity> findAllCustom();
}
