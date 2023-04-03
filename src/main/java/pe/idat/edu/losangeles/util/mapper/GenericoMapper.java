
package pe.idat.edu.losangeles.util.mapper;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Sebastian
 */
@Component
public class GenericoMapper<E, D> {

    @Autowired
    private ModelMapper mapper;

    public List<D> ConvertirListaDTO(List<E> e, Class<D> d) {
        return e.stream().map(t -> mapper.map(t, d)).collect(Collectors.toList());
    }

    public List<E> ConvertirListaEntity(List<D> d, Class<E> e) {
        return d.stream().map(t -> mapper.map(t, e)).collect(Collectors.toList());
    }

    public D ConvertirDTO(E e, Class<D> d) {
        return mapper.map(e, d);
    }

    public E ConvertirEntity(D d, Class<E> e) {
        return mapper.map(d, e);
    }
}
