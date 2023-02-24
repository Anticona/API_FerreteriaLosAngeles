

package pe.idat.edu.losangeles.repository.pedido;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.losangeles.entity.pedido.MarcaEntity;

/**
 *
 * @author Sebastian
 */
public interface MarcaRepository extends JpaRepository<MarcaEntity, Long>{
    @Query("select m from MarcaEntity m where m.estado=1")
    List<MarcaEntity> findAllCustom();
}
