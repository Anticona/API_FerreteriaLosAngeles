

package pe.idat.edu.losangeles.repository.generico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author Sebastian
 * @param <T>
 * @param <ID>
 */
@NoRepositoryBean
public interface GenericoRepository<T,ID> extends JpaRepository<T, ID>{

}
