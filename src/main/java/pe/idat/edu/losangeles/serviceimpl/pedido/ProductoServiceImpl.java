
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.pedido.ProductoEntity;
import pe.idat.edu.losangeles.repository.pedido.ProductoRepository;
import pe.idat.edu.losangeles.service.pedido.ProductoService;

/**
 *
 * @author Sebastian
 */
@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
     private ProductoRepository repositorio;

    @Override
    public List<ProductoEntity> findAll() {
      return repositorio.findAll();        
    }

    @Override
    public List<ProductoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    
    @Override
    public ProductoEntity add(ProductoEntity p) {
        return repositorio.save(p);
    }

//    @Override
//    public Optional<ProductoEntity> findById(Long id) {
//        return repositorio.findById(id);
//    }

    @Override
    public ProductoEntity update(ProductoEntity p) {
        ProductoEntity objproducto=repositorio.getById(p.getIdproducto());
        BeanUtils.copyProperties(p, objproducto);
        return repositorio.save(objproducto);
    }

    @Override
    public ProductoEntity delete(ProductoEntity p) {
        ProductoEntity objproducto=repositorio.getById(p.getIdproducto());
        objproducto.setEstado(false);
        return repositorio.save(objproducto);
    }

    @Override
    public ProductoEntity enable(ProductoEntity p) {
        ProductoEntity objproducto=repositorio.getById(p.getIdproducto());
        objproducto.setEstado(true);
        return repositorio.save(objproducto);
    }

    @Override
    public ProductoEntity findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
