

package pe.idat.edu.losangeles.repository.pedido;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.losangeles.entity.pedido.ClienteEntity;

/**
 *
 * @author Sebastian
 */
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long>{
    @Query("select c from ClienteEntity c where c.estado=1")
    List<ClienteEntity> findAllCustom();
}
