

package pe.idat.edu.losangeles.repository.pedido;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.losangeles.entity.pedido.UsuarioEntity;

/**
 *
 * @author Sebastian
 */
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
    @Query("select u from UsuarioEntity u where u.estado=1")
    List<UsuarioEntity> findAllCustom();
}
