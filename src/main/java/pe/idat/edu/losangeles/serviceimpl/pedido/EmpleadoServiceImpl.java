
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.dto.pedido.EmpleadoDTO;
import pe.idat.edu.losangeles.entity.pedido.EmpleadoEntity;
import pe.idat.edu.losangeles.repository.pedido.EmpleadoRepository;
import pe.idat.edu.losangeles.service.pedido.EmpleadoService;
import pe.idat.edu.losangeles.util.mapper.GenericoMapper;

/**
 *
 * @author Sebastian
 */
@RequiredArgsConstructor
@Service
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
     private EmpleadoRepository repositorio;
    
    @Autowired
    private GenericoMapper<EmpleadoEntity, EmpleadoDTO> mapper;

    @Override
    public List<EmpleadoDTO> findAll() {
        List<EmpleadoEntity> lista = repositorio.findAll();
        return mapper.ConvertirListaDTO(lista, EmpleadoDTO.class);
    }

    @Override
    public List<EmpleadoDTO> findAllCustom() {
        List<EmpleadoEntity> lista = repositorio.findAllCustom();
        return mapper.ConvertirListaDTO(lista, EmpleadoDTO.class);
    }

    @Override
    public EmpleadoDTO add(EmpleadoDTO e) {
        EmpleadoEntity objempleado = mapper.ConvertirEntity(e, EmpleadoEntity.class);
        return mapper.ConvertirDTO(repositorio.save(objempleado), EmpleadoDTO.class);
    }

    @Override
    public EmpleadoDTO findById(Long id) {
        EmpleadoEntity lista = repositorio.findById(id).get();
        return mapper.ConvertirDTO(lista, EmpleadoDTO.class);    
    }
    
    @Override
    public EmpleadoDTO update(EmpleadoDTO e) {
        EmpleadoEntity objempleado = repositorio.getById(e.getIdempleado());
        BeanUtils.copyProperties(e, objempleado);
        return mapper.ConvertirDTO(repositorio.save(objempleado), EmpleadoDTO.class);
    }

    @Override
    public EmpleadoDTO delete(EmpleadoDTO e) {
        EmpleadoEntity objempleado = repositorio.getById(e.getIdempleado());
        objempleado.setEstado(false);
        return mapper.ConvertirDTO(repositorio.save(objempleado), EmpleadoDTO.class);
    }

    @Override
    public EmpleadoDTO enable(EmpleadoDTO e) {
        EmpleadoEntity objempleado = repositorio.getById(e.getIdempleado());
        objempleado.setEstado(true);
        return mapper.ConvertirDTO(repositorio.save(objempleado), EmpleadoDTO.class);
    }

    
}
