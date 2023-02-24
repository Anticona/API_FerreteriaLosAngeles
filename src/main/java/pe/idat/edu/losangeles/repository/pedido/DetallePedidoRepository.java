

package pe.idat.edu.losangeles.repository.pedido;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.losangeles.entity.pedido.DetallePedidoEntity;

/**
 *
 * @author Sebastian
 */
public interface DetallePedidoRepository extends JpaRepository<DetallePedidoEntity, Long>{
    @Query("select d from DetallePedidoEntity d where d.estado=1")
    List<DetallePedidoEntity> findAllCustom();
}
