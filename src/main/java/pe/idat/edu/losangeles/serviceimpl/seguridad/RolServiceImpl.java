
package pe.idat.edu.losangeles.serviceimpl.seguridad;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.seguridad.RolEntity;
import pe.idat.edu.losangeles.repository.seguridad.RolRepository;
import pe.idat.edu.losangeles.service.seguridad.RolService;

/**
 *
 * @author Sebastian
 */

@Service
public class RolServiceImpl implements RolService{

    @Autowired
     private RolRepository repositorio;

    @Override
    public List<RolEntity> findAll() {
      return repositorio.findAll();        
    }

    @Override
    public List<RolEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    
    @Override
    public RolEntity add(RolEntity r) {
        return repositorio.save(r);
    }

    @Override
    public Optional<RolEntity> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public RolEntity update(RolEntity r) {
        RolEntity objrol=repositorio.getById(r.getIdrol());
        BeanUtils.copyProperties(r, objrol);
        return repositorio.save(objrol);
    }

    @Override
    public RolEntity delete(RolEntity r) {
        RolEntity objrol=repositorio.getById(r.getIdrol());
        objrol.setEstado(false);
        return repositorio.save(objrol);
    }

    @Override
    public RolEntity enable(RolEntity r) {
        RolEntity objrol=repositorio.getById(r.getIdrol());
        objrol.setEstado(true);
        return repositorio.save(objrol);
    }
}
