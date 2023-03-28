
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.idat.edu.losangeles.entity.pedido.UsuarioEntity;
import pe.idat.edu.losangeles.repository.pedido.UsuarioRepository;
import pe.idat.edu.losangeles.service.pedido.UsuarioService;

/**
 *
 * @author Sebastian
 */
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

    @Override
    public Optional<UsuarioEntity> findById(Long id) {
        return repositorio.findById(id);
    }

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

}
