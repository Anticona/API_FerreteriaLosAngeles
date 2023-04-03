
package pe.idat.edu.losangeles.serviceimpl.seguridad;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.seguridad.UsuarioEntity;
import pe.idat.edu.losangeles.repository.seguridad.UsuarioRepository;
import pe.idat.edu.losangeles.service.seguridad.UsuarioService;

/**
 *
 * @author Sebastian
 */
@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
     private UsuarioRepository repositorio;

    @Override
    public List<UsuarioEntity> findAll() {
      return repositorio.findAll();        
    }

    @Override
    public List<UsuarioEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    
    @Override
    public UsuarioEntity add(UsuarioEntity u) {
        return repositorio.save(u);
    }

//    @Override
//    public Optional<UsuarioEntity> findById(Long id) {
//        return repositorio.findById(id);
//    }

    @Override
    public UsuarioEntity update(UsuarioEntity u) {
        UsuarioEntity objusuario=repositorio.getById(u.getIdusuario());
        BeanUtils.copyProperties(u, objusuario);
        return repositorio.save(objusuario);
    }

    @Override
    public UsuarioEntity delete(UsuarioEntity u) {
        UsuarioEntity objusuario=repositorio.getById(u.getIdusuario());
        objusuario.setEstado(false);
        return repositorio.save(objusuario);
    }

    @Override
    public UsuarioEntity enable(UsuarioEntity u) {
        UsuarioEntity objusuario=repositorio.getById(u.getIdusuario());
        objusuario.setEstado(true);
        return repositorio.save(objusuario);
    }

    @Override
    public UsuarioEntity findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
