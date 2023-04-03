
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.dto.pedido.ProductoDTO;
import pe.idat.edu.losangeles.entity.pedido.ProductoEntity;
import pe.idat.edu.losangeles.repository.pedido.ProductoRepository;
import pe.idat.edu.losangeles.service.pedido.ProductoService;
import pe.idat.edu.losangeles.util.mapper.GenericoMapper;

/**
 *
 * @author Sebastian
 */
@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
     private ProductoRepository repositorio;
    
    @Autowired
    private GenericoMapper<ProductoEntity, ProductoDTO> mapper;

    @Override
    public List<ProductoDTO> findAll() {
        List<ProductoEntity> lista = repositorio.findAll();
        return mapper.ConvertirListaDTO(lista, ProductoDTO.class);
    }

    @Override
    public List<ProductoDTO> findAllCustom() {
        List<ProductoEntity> lista = repositorio.findAllCustom();
        return mapper.ConvertirListaDTO(lista, ProductoDTO.class);
    }

    @Override
    public ProductoDTO add(ProductoDTO p) {
        ProductoEntity objproducto = mapper.ConvertirEntity(p, ProductoEntity.class);
        return mapper.ConvertirDTO(repositorio.save(objproducto), ProductoDTO.class);
    }

    @Override
    public ProductoDTO findById(Long id) {
        ProductoEntity lista = repositorio.findById(id).get();
        return mapper.ConvertirDTO(lista, ProductoDTO.class);    
    }

    @Override
    public ProductoDTO update(ProductoDTO p) {
        ProductoEntity objproducto = repositorio.getById(p.getIdproducto());
        BeanUtils.copyProperties(p, objproducto);
        return mapper.ConvertirDTO(repositorio.save(objproducto), ProductoDTO.class);
    }

    @Override
    public ProductoDTO delete(ProductoDTO p) {
        ProductoEntity objproducto = repositorio.getById(p.getIdproducto());
        objproducto.setEstado(false);
        return mapper.ConvertirDTO(repositorio.save(objproducto), ProductoDTO.class);
    }

    @Override
    public ProductoDTO enable(ProductoDTO p) {
        ProductoEntity objproducto = repositorio.getById(p.getIdproducto());
        objproducto.setEstado(true);
        return mapper.ConvertirDTO(repositorio.save(objproducto), ProductoDTO.class);
    }
    

}
