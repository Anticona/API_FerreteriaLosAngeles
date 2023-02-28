
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.pedido.MarcaEntity;
import pe.idat.edu.losangeles.repository.pedido.MarcaRepository;
import pe.idat.edu.losangeles.service.pedido.MarcaService;

/**
 *
 * @author Sebastian
 */
@Service
public class MarcaServiceImpl implements MarcaService{

    @Autowired
     private MarcaRepository repositorio;

    @Override
    public List<MarcaEntity> findAll() {
      return repositorio.findAll();        
    }

    @Override
    public List<MarcaEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    
    @Override
    public MarcaEntity add(MarcaEntity m) {
        return repositorio.save(m);
    }

    @Override
    public Optional<MarcaEntity> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public MarcaEntity update(MarcaEntity m) {
        MarcaEntity objmarca=repositorio.getById(m.getIdmarca());
        BeanUtils.copyProperties(m, objmarca);
        return repositorio.save(objmarca);
    }

    @Override
    public MarcaEntity delete(MarcaEntity m) {
        MarcaEntity objmarca=repositorio.getById(m.getIdmarca());
        objmarca.setEstado(false);
        return repositorio.save(objmarca);
    }

    @Override
    public MarcaEntity enable(MarcaEntity m) {
        MarcaEntity objmarca=repositorio.getById(m.getIdmarca());
        objmarca.setEstado(true);
        return repositorio.save(objmarca);
    }
}
