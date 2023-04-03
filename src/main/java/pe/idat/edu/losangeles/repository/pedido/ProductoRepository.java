

package pe.idat.edu.losangeles.repository.pedido;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.losangeles.entity.pedido.ProductoEntity;
import pe.idat.edu.losangeles.repository.generico.GenericoRepository;

/**
 *
 * @author Sebastian
 */
public interface ProductoRepository extends GenericoRepository<ProductoEntity, Long>{
    @Query("select p from ProductoEntity p where p.estado=1")
    List<ProductoEntity> findAllCustom();
}
