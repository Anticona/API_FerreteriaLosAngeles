
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.idat.edu.losangeles.entity.pedido.UsuarioRolEntity;
import pe.idat.edu.losangeles.repository.pedido.UsuarioRolRepository;
import pe.idat.edu.losangeles.service.pedido.UsuarioRolService;

/**
 *
 * @author Sebastian
 */
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

    @Override
    public Optional<UsuarioRolEntity> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public UsuarioRolEntity update(UsuarioRolEntity u) {
        UsuarioRolEntity objusuariorol=repositorio.getById(u.getIdusuariorol());
        BeanUtils.copyProperties(u, objusuariorol);
        return repositorio.save(objusuariorol);
    }

}
