

package pe.idat.edu.losangeles.repository.pedido;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.idat.edu.losangeles.entity.pedido.ClienteEntity;
import pe.idat.edu.losangeles.repository.generico.GenericoRepository;

/**
 *
 * @author Sebastian
 */
@Repository
public interface ClienteRepository extends GenericoRepository<ClienteEntity, Long>{
    @Query("select c from ClienteEntity c where c.estado=1")
    List<ClienteEntity> findAllCustom();
}
