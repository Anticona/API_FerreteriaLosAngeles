
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.dto.pedido.DetallePedidoDTO;
import pe.idat.edu.losangeles.entity.pedido.DetallePedidoEntity;
import pe.idat.edu.losangeles.repository.pedido.DetallePedidoRepository;
import pe.idat.edu.losangeles.service.pedido.DetallePedidoService;
import pe.idat.edu.losangeles.util.mapper.GenericoMapper;

/**
 *
 * @author Sebastian
 */
@RequiredArgsConstructor
@Service
public class DetallePedidoServiceImpl implements DetallePedidoService{

    @Autowired 
    private DetallePedidoRepository repositorio;
    
    @Autowired
    private GenericoMapper<DetallePedidoEntity, DetallePedidoDTO> mapper;

    @Override
    public List<DetallePedidoDTO> findAll() {
        List<DetallePedidoEntity> lista = repositorio.findAll();
        return mapper.ConvertirListaDTO(lista, DetallePedidoDTO.class);
    }

    @Override
    public List<DetallePedidoDTO> findAllCustom() {
        List<DetallePedidoEntity> lista = repositorio.findAllCustom();
        return mapper.ConvertirListaDTO(lista, DetallePedidoDTO.class);
    }

    @Override
    public DetallePedidoDTO add(DetallePedidoDTO d) {
        DetallePedidoEntity objdetallepedido = mapper.ConvertirEntity(d, DetallePedidoEntity.class);
        return mapper.ConvertirDTO(repositorio.save(objdetallepedido), DetallePedidoDTO.class);
    }

    @Override
    public DetallePedidoDTO findById(Long id) {
        DetallePedidoEntity lista = repositorio.findById(id).get();
        return mapper.ConvertirDTO(lista, DetallePedidoDTO.class);    
    }
    
    @Override
    public DetallePedidoDTO update(DetallePedidoDTO d) {
        DetallePedidoEntity objdetallepedido = repositorio.getById(d.getIddetallepedido());
        BeanUtils.copyProperties(d, objdetallepedido);
        return mapper.ConvertirDTO(repositorio.save(objdetallepedido), DetallePedidoDTO.class);
    }

    @Override
    public DetallePedidoDTO delete(DetallePedidoDTO d) {
        DetallePedidoEntity objdetallepedido = repositorio.getById(d.getIddetallepedido());
        objdetallepedido.setEstado(false);
        return mapper.ConvertirDTO(repositorio.save(objdetallepedido), DetallePedidoDTO.class);
    }

    @Override
    public DetallePedidoDTO enable(DetallePedidoDTO d) {
        DetallePedidoEntity objdetallepedido = repositorio.getById(d.getIddetallepedido());
        objdetallepedido.setEstado(true);
        return mapper.ConvertirDTO(repositorio.save(objdetallepedido), DetallePedidoDTO.class);
    }

}
