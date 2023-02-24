

package pe.idat.edu.losangeles.service.generico;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Sebastian
 * @param <T>
 */
public interface GenericoService<T> {
    List<T> findAll();
    List<T> findAllCustom();
    T add(T t);
    Optional<T> findById(Long id);
    T update(T t);
    T delete(T t);
}
