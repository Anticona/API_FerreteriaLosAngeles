
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.dto.pedido.PedidoDTO;
import pe.idat.edu.losangeles.entity.pedido.PedidoEntity;
import pe.idat.edu.losangeles.repository.pedido.PedidoRepository;
import pe.idat.edu.losangeles.service.pedido.PedidoService;
import pe.idat.edu.losangeles.util.mapper.GenericoMapper;

/**
 *
 * @author Sebastian
 */
@RequiredArgsConstructor
@Service
public class PedidoServiceImpl implements PedidoService{

    @Autowired
     private PedidoRepository repositorio;

    @Autowired
    private GenericoMapper<PedidoEntity, PedidoDTO> mapper;

    @Override
    public List<PedidoDTO> findAll() {
        List<PedidoEntity> lista = repositorio.findAll();
        return mapper.ConvertirListaDTO(lista, PedidoDTO.class);
    }

    @Override
    public List<PedidoDTO> findAllCustom() {
        List<PedidoEntity> lista = repositorio.findAllCustom();
        return mapper.ConvertirListaDTO(lista, PedidoDTO.class);
    }

    @Override
    public PedidoDTO add(PedidoDTO p) {
        PedidoEntity objpedido = mapper.ConvertirEntity(p, PedidoEntity.class);
        return mapper.ConvertirDTO(repositorio.save(objpedido), PedidoDTO.class);
    }

    @Override
    public PedidoDTO findById(Long id) {
        PedidoEntity lista = repositorio.findById(id).get();
        return mapper.ConvertirDTO(lista, PedidoDTO.class);    
    }
    
    @Override
    public PedidoDTO update(PedidoDTO p) {
        PedidoEntity objpedido = repositorio.getById(p.getIdpedido());
        BeanUtils.copyProperties(p, objpedido);
        return mapper.ConvertirDTO(repositorio.save(objpedido), PedidoDTO.class);
    }

    @Override
    public PedidoDTO delete(PedidoDTO p) {
        PedidoEntity objpedido = repositorio.getById(p.getIdpedido());
        objpedido.setEstado(false);
        return mapper.ConvertirDTO(repositorio.save(objpedido), PedidoDTO.class);
    }

    @Override
    public PedidoDTO enable(PedidoDTO p) {
        PedidoEntity objpedido = repositorio.getById(p.getIdpedido());
        objpedido.setEstado(true);
        return mapper.ConvertirDTO(repositorio.save(objpedido), PedidoDTO.class);
    }
    
}
