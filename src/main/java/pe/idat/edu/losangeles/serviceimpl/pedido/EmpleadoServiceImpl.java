
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.pedido.EmpleadoEntity;
import pe.idat.edu.losangeles.repository.pedido.EmpleadoRepository;
import pe.idat.edu.losangeles.service.pedido.EmpleadoService;

/**
 *
 * @author Sebastian
 */
@Service
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
     private EmpleadoRepository repositorio;

    @Override
    public List<EmpleadoEntity> findAll() {
      return repositorio.findAll();        
    }

    @Override
    public List<EmpleadoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    
    @Override
    public EmpleadoEntity add(EmpleadoEntity e) {
        return repositorio.save(e);
    }

    @Override
    public Optional<EmpleadoEntity> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public EmpleadoEntity update(EmpleadoEntity e) {
        EmpleadoEntity objempleado=repositorio.getById(e.getIdempleado());
        BeanUtils.copyProperties(e, objempleado);
        return repositorio.save(objempleado);
    }

    @Override
    public EmpleadoEntity delete(EmpleadoEntity e) {
        EmpleadoEntity objempleado=repositorio.getById(e.getIdempleado());
        objempleado.setEstado(false);
        return repositorio.save(objempleado);
    }
}
