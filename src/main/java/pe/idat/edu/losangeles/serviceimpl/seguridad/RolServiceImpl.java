
package pe.idat.edu.losangeles.serviceimpl.seguridad;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.dto.seguridad.RolDTO;
import pe.idat.edu.losangeles.entity.seguridad.RolEntity;
import pe.idat.edu.losangeles.repository.seguridad.RolRepository;
import pe.idat.edu.losangeles.service.seguridad.RolService;
import pe.idat.edu.losangeles.util.mapper.GenericoMapper;

/**
 *
 * @author Sebastian
 */
@RequiredArgsConstructor
@Service
public class RolServiceImpl implements RolService{

    @Autowired
     private RolRepository repositorio;

    @Autowired
    private GenericoMapper<RolEntity, RolDTO> mapper;
    
    @Override
    public List<RolDTO> findAll() {
        List<RolEntity> lista = repositorio.findAll();
        return mapper.ConvertirListaDTO(lista, RolDTO.class);    
    }

    @Override
    public List<RolDTO> findAllCustom() {
        List<RolEntity> lista = repositorio.findAllCustom();
        return mapper.ConvertirListaDTO(lista, RolDTO.class);    
    }

    @Override
    public RolDTO add(RolDTO r) {
        RolEntity objrol = mapper.ConvertirEntity(r, RolEntity.class);
        return mapper.ConvertirDTO(repositorio.save(objrol), RolDTO.class);
   }

    @Override
    public RolDTO findById(Long id) {
        RolEntity lista = repositorio.findById(id).get();
        return mapper.ConvertirDTO(lista, RolDTO.class);    
    }

    @Override
    public RolDTO update(RolDTO r) {
        RolEntity objrol = repositorio.getById(r.getIdrol());
        BeanUtils.copyProperties(r, objrol);
        return mapper.ConvertirDTO(repositorio.save(objrol), RolDTO.class);
    }

    @Override
    public RolDTO delete(RolDTO r) {
        RolEntity objrol = repositorio.getById(r.getIdrol());
        objrol.setEstado(false);
        return mapper.ConvertirDTO(repositorio.save(objrol), RolDTO.class);
    }

    @Override
    public RolDTO enable(RolDTO r) {
        RolEntity objrol = repositorio.getById(r.getIdrol());
        objrol.setEstado(true);
        return mapper.ConvertirDTO(repositorio.save(objrol), RolDTO.class);
    }


}
