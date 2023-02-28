
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.pedido.CategoriaEntity;
import pe.idat.edu.losangeles.repository.pedido.CategoriaRepository;
import pe.idat.edu.losangeles.service.pedido.CategoriaService;

/**
 *
 * @author Sebastian
 */
@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
     private CategoriaRepository repositorio;

    @Override
    public List<CategoriaEntity> findAll() {
      return repositorio.findAll();        
    }

    @Override
    public List<CategoriaEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    
    @Override
    public CategoriaEntity add(CategoriaEntity c) {
        return repositorio.save(c);
    }

    @Override
    public Optional<CategoriaEntity> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public CategoriaEntity update(CategoriaEntity c) {
        CategoriaEntity objcategoria=repositorio.getById(c.getIdcategoria());
        BeanUtils.copyProperties(c, objcategoria);
        return repositorio.save(objcategoria);
    }

    @Override
    public CategoriaEntity delete(CategoriaEntity c) {
        CategoriaEntity objcategoria=repositorio.getById(c.getIdcategoria());
        objcategoria.setEstado(false);
        return repositorio.save(objcategoria);
    }

    @Override
    public CategoriaEntity enable(CategoriaEntity c) {
        CategoriaEntity objcategoria=repositorio.getById(c.getIdcategoria());
        objcategoria.setEstado(true);
        return repositorio.save(objcategoria);
    }

}
