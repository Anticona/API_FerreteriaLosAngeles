
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.dto.pedido.MarcaDTO;
import pe.idat.edu.losangeles.entity.pedido.MarcaEntity;
import pe.idat.edu.losangeles.repository.pedido.MarcaRepository;
import pe.idat.edu.losangeles.service.pedido.MarcaService;
import pe.idat.edu.losangeles.util.mapper.GenericoMapper;

/**
 *
 * @author Sebastian
 */
@RequiredArgsConstructor
@Service
public class MarcaServiceImpl implements MarcaService{

    @Autowired
     private MarcaRepository repositorio;
    
    @Autowired
    private GenericoMapper<MarcaEntity, MarcaDTO> mapper;

    @Override
    public List<MarcaDTO> findAll() {
         List<MarcaEntity> lista = repositorio.findAll();
        return mapper.ConvertirListaDTO(lista, MarcaDTO.class);   
    }

    @Override
    public List<MarcaDTO> findAllCustom() {
        List<MarcaEntity> lista = repositorio.findAllCustom();
        return mapper.ConvertirListaDTO(lista, MarcaDTO.class);
    }

    @Override
    public MarcaDTO add(MarcaDTO m) {
        MarcaEntity objcategoria = mapper.ConvertirEntity(m, MarcaEntity.class);
        return mapper.ConvertirDTO(repositorio.save(objcategoria), MarcaDTO.class);
    }

    @Override
    public MarcaDTO findById(Long id) {
        MarcaEntity lista = repositorio.findById(id).get();
        return mapper.ConvertirDTO(lista, MarcaDTO.class);  
    }

    @Override
    public MarcaDTO update(MarcaDTO m) {
        MarcaEntity objmarca = repositorio.getById(m.getIdmarca());
        BeanUtils.copyProperties(m, objmarca);
        return mapper.ConvertirDTO(repositorio.save(objmarca), MarcaDTO.class);
    }

    @Override
    public MarcaDTO delete(MarcaDTO m) {
        MarcaEntity objmarca = repositorio.getById(m.getIdmarca());
        objmarca.setEstado(false);
        return mapper.ConvertirDTO(repositorio.save(objmarca), MarcaDTO.class);
    }

    @Override
    public MarcaDTO enable(MarcaDTO m) {
        MarcaEntity objmarca = repositorio.getById(m.getIdmarca());
        objmarca.setEstado(true);
        return mapper.ConvertirDTO(repositorio.save(objmarca), MarcaDTO.class);
    }

    
}
