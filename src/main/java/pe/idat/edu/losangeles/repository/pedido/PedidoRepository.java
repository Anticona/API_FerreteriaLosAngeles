

package pe.idat.edu.losangeles.repository.pedido;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.losangeles.entity.pedido.PedidoEntity;

/**
 *
 * @author Sebastian
 */
public interface PedidoRepository extends JpaRepository<PedidoEntity, Long>{
    @Query("select p from PedidoEntity p where p.estado=1")
    List<PedidoEntity> findAllCustom();
}
