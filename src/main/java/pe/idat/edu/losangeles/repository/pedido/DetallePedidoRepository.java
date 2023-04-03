

package pe.idat.edu.losangeles.repository.pedido;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.idat.edu.losangeles.entity.pedido.DetallePedidoEntity;
import pe.idat.edu.losangeles.repository.generico.GenericoRepository;

/**
 *
 * @author Sebastian
 */
@Repository
public interface DetallePedidoRepository extends GenericoRepository<DetallePedidoEntity, Long>{
    @Query("select d from DetallePedidoEntity d where d.estado=1")
    List<DetallePedidoEntity> findAllCustom();
}
