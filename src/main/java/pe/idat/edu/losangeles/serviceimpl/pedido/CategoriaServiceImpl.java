
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.dto.pedido.CategoriaDTO;
import pe.idat.edu.losangeles.entity.pedido.CategoriaEntity;
import pe.idat.edu.losangeles.repository.pedido.CategoriaRepository;
import pe.idat.edu.losangeles.service.pedido.CategoriaService;
import pe.idat.edu.losangeles.util.mapper.GenericoMapper;

/**
 *
 * @author Sebastian
 */
@RequiredArgsConstructor
@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
     private CategoriaRepository repositorio;
    
    @Autowired
    private GenericoMapper<CategoriaEntity, CategoriaDTO> categoriamapper;


    @Override
    public List<CategoriaDTO> findAll() {
        List<CategoriaEntity> lista = repositorio.findAll();
        return categoriamapper.ConvertirListaDTO(lista, CategoriaDTO.class);
    }

    @Override
    public List<CategoriaDTO> findAllCustom() {
        List<CategoriaEntity> lista = repositorio.findAllCustom();
        return categoriamapper.ConvertirListaDTO(lista, CategoriaDTO.class);
    }

    @Override
    public CategoriaDTO add(CategoriaDTO c) {
        CategoriaEntity objcategoria = categoriamapper.ConvertirEntity(c, CategoriaEntity.class);
        return categoriamapper.ConvertirDTO(repositorio.save(objcategoria), CategoriaDTO.class);
    }

    @Override
    public CategoriaDTO findById(Long id) {
        CategoriaEntity lista = repositorio.findById(id).get();
        return categoriamapper.ConvertirDTO(lista, CategoriaDTO.class);    
    }
    
    @Override
    public CategoriaDTO update(CategoriaDTO c) {
        CategoriaEntity objcategoria = repositorio.getById(c.getIdcategoria());
        BeanUtils.copyProperties(c, objcategoria);
        return categoriamapper.ConvertirDTO(repositorio.save(objcategoria), CategoriaDTO.class);
    }

    @Override
    public CategoriaDTO delete(CategoriaDTO c) {
        CategoriaEntity objcategoria = repositorio.getById(c.getIdcategoria());
        objcategoria.setEstado(false);
        return categoriamapper.ConvertirDTO(repositorio.save(objcategoria), CategoriaDTO.class);

    }

    @Override
    public CategoriaDTO enable(CategoriaDTO c) {
        CategoriaEntity objcategoria = repositorio.getById(c.getIdcategoria());
        objcategoria.setEstado(true);
        return categoriamapper.ConvertirDTO(repositorio.save(objcategoria), CategoriaDTO.class);
    }


}

