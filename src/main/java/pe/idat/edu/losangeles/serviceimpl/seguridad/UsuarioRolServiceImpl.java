
package pe.idat.edu.losangeles.serviceimpl.seguridad;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.dto.seguridad.UsuarioRolDTO;
import pe.idat.edu.losangeles.entity.seguridad.UsuarioRolEntity;
import pe.idat.edu.losangeles.repository.seguridad.UsuarioRolRepository;
import pe.idat.edu.losangeles.service.seguridad.UsuarioRolService;
import pe.idat.edu.losangeles.util.mapper.GenericoMapper;

/**
 *
 * @author Sebastian
 */
@RequiredArgsConstructor
@Service
public class UsuarioRolServiceImpl implements UsuarioRolService{

    @Autowired
     private UsuarioRolRepository repositorio;
    
    @Autowired
    private GenericoMapper<UsuarioRolEntity, UsuarioRolDTO> mapper;

    @Override
    public List<UsuarioRolDTO> findAll() {
        List<UsuarioRolEntity> lista = repositorio.findAll();
        return mapper.ConvertirListaDTO(lista, UsuarioRolDTO.class);
    }

    @Override
    public List<UsuarioRolDTO> findAllCustom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UsuarioRolDTO add(UsuarioRolDTO u) {
        UsuarioRolEntity objusuariorol = mapper.ConvertirEntity(u, UsuarioRolEntity.class);
        return mapper.ConvertirDTO(repositorio.save(objusuariorol), UsuarioRolDTO.class);
    }

    @Override
    public UsuarioRolDTO findById(Long id) {
        UsuarioRolEntity lista = repositorio.findById(id).get();
        return mapper.ConvertirDTO(lista, UsuarioRolDTO.class);    
    }
    
    @Override
    public UsuarioRolDTO update(UsuarioRolDTO u) {
        UsuarioRolEntity objusuariorol = repositorio.getById(u.getIdusuariorol());
        BeanUtils.copyProperties(u, objusuariorol);
        return mapper.ConvertirDTO(repositorio.save(objusuariorol), UsuarioRolDTO.class);
    }

    @Override
    public UsuarioRolDTO delete(UsuarioRolDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UsuarioRolDTO enable(UsuarioRolDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
