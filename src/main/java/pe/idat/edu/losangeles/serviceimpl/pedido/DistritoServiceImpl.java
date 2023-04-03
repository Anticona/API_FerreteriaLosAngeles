
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.dto.pedido.DistritoDTO;
import pe.idat.edu.losangeles.entity.pedido.DistritoEntity;
import pe.idat.edu.losangeles.repository.pedido.DistritoRepository;
import pe.idat.edu.losangeles.service.pedido.DistritoService;
import pe.idat.edu.losangeles.util.mapper.GenericoMapper;

/**
 *
 * @author Sebastian
 */
@Service
public class DistritoServiceImpl implements DistritoService{

    @Autowired 
    private DistritoRepository repositorio;

    @Autowired
    private GenericoMapper<DistritoEntity, DistritoDTO> mapper;
    
    @Override
    public List<DistritoDTO> findAll() {
        List<DistritoEntity> lista = repositorio.findAll();
        return mapper.ConvertirListaDTO(lista, DistritoDTO.class);
    }

    @Override
    public List<DistritoDTO> findAllCustom() {
        List<DistritoEntity> lista = repositorio.findAllCustom();
        return mapper.ConvertirListaDTO(lista, DistritoDTO.class);
    }

    @Override
    public DistritoDTO add(DistritoDTO d) {
        DistritoEntity objdistrito = mapper.ConvertirEntity(d, DistritoEntity.class);
        return mapper.ConvertirDTO(repositorio.save(objdistrito), DistritoDTO.class);
    }

    @Override
    public DistritoDTO findById(Long id) {
        DistritoEntity lista = repositorio.findById(id).get();
        return mapper.ConvertirDTO(lista, DistritoDTO.class);    
    }
    
    @Override
    public DistritoDTO update(DistritoDTO d) {
        DistritoEntity objdistrito = repositorio.getById(d.getIddistrito());
        BeanUtils.copyProperties(d, objdistrito);
        return mapper.ConvertirDTO(repositorio.save(objdistrito), DistritoDTO.class);
    }

    @Override
    public DistritoDTO delete(DistritoDTO d) {
        DistritoEntity objdistrito = repositorio.getById(d.getIddistrito());
        objdistrito.setEstado(false);
        return mapper.ConvertirDTO(repositorio.save(objdistrito), DistritoDTO.class);
    }

    @Override
    public DistritoDTO enable(DistritoDTO d) {
        DistritoEntity objdistrito = repositorio.getById(d.getIddistrito());
        objdistrito.setEstado(true);
        return mapper.ConvertirDTO(repositorio.save(objdistrito), DistritoDTO.class);
    }
    
}
