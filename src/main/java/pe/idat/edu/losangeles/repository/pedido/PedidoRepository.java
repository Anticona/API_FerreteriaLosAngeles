

package pe.idat.edu.losangeles.repository.pedido;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.idat.edu.losangeles.entity.pedido.PedidoEntity;
import pe.idat.edu.losangeles.repository.generico.GenericoRepository;

/**
 *
 * @author Sebastian
 */
@Repository
public interface PedidoRepository extends GenericoRepository<PedidoEntity, Long>{
    @Query("select p from PedidoEntity p where p.estado=1")
    List<PedidoEntity> findAllCustom();
}
