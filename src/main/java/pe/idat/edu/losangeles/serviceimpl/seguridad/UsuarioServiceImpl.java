
package pe.idat.edu.losangeles.serviceimpl.seguridad;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.dto.seguridad.UsuarioDTO;
import pe.idat.edu.losangeles.entity.seguridad.UsuarioEntity;
import pe.idat.edu.losangeles.repository.seguridad.UsuarioRepository;
import pe.idat.edu.losangeles.service.seguridad.UsuarioService;
import pe.idat.edu.losangeles.util.mapper.GenericoMapper;

/**
 *
 * @author Sebastian
 */
@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
     private UsuarioRepository repositorio;

    @Autowired
    private GenericoMapper<UsuarioEntity, UsuarioDTO> mapper;
    
    @Override
    public List<UsuarioDTO> findAll() {
        List<UsuarioEntity> lista = repositorio.findAll();
        return mapper.ConvertirListaDTO(lista, UsuarioDTO.class);
    }

    @Override
    public List<UsuarioDTO> findAllCustom() {
        List<UsuarioEntity> lista = repositorio.findAllCustom();
        return mapper.ConvertirListaDTO(lista, UsuarioDTO.class);
    }

    @Override
    public UsuarioDTO add(UsuarioDTO u) {
        UsuarioEntity objusuario = mapper.ConvertirEntity(u, UsuarioEntity.class);
        return mapper.ConvertirDTO(repositorio.save(objusuario), UsuarioDTO.class);
    }

    @Override
    public UsuarioDTO findById(Long id) {
        UsuarioEntity lista = repositorio.findById(id).get();
        return mapper.ConvertirDTO(lista, UsuarioDTO.class);    
    }
    
    @Override
    public UsuarioDTO update(UsuarioDTO u) {
        UsuarioEntity objusuario = repositorio.getById(u.getIdusuario());
        BeanUtils.copyProperties(u, objusuario);
        return mapper.ConvertirDTO(repositorio.save(objusuario), UsuarioDTO.class);
    }

    @Override
    public UsuarioDTO delete(UsuarioDTO u) {
        UsuarioEntity objusuario = repositorio.getById(u.getIdusuario());
        objusuario.setEstado(false);
        return mapper.ConvertirDTO(repositorio.save(objusuario), UsuarioDTO.class);
    }

    @Override
    public UsuarioDTO enable(UsuarioDTO u) {
        UsuarioEntity objusuario = repositorio.getById(u.getIdusuario());
        objusuario.setEstado(true);
        return mapper.ConvertirDTO(repositorio.save(objusuario), UsuarioDTO.class);
    }

    
}
