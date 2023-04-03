
package pe.idat.edu.losangeles.serviceimpl.seguridad;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.seguridad.UsuarioRolEntity;
import pe.idat.edu.losangeles.repository.seguridad.UsuarioRolRepository;
import pe.idat.edu.losangeles.service.seguridad.UsuarioRolService;

/**
 *
 * @author Sebastian
 */
@Service
public class UsuarioRolImpl implements UsuarioRolService{

    @Autowired
     private UsuarioRolRepository repositorio;

    @Override
    public List<UsuarioRolEntity> findAll() {
      return repositorio.findAll();        
    }

    
    @Override
    public UsuarioRolEntity add(UsuarioRolEntity u) {
        return repositorio.save(u);
    }

//    @Override
//    public Optional<UsuarioRolEntity> findById(Long id) {
//        return repositorio.findById(id);
//    }

    @Override
    public UsuarioRolEntity update(UsuarioRolEntity u) {
        UsuarioRolEntity objusuariorol=repositorio.getById(u.getIdusuariorol());
        BeanUtils.copyProperties(u, objusuariorol);
        return repositorio.save(objusuariorol);
    }

    @Override
    public List<UsuarioRolEntity> findAllCustom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UsuarioRolEntity delete(UsuarioRolEntity t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UsuarioRolEntity enable(UsuarioRolEntity t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UsuarioRolEntity findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
