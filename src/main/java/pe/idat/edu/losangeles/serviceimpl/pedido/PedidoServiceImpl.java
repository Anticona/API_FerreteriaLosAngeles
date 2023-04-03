
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.pedido.PedidoEntity;
import pe.idat.edu.losangeles.repository.pedido.PedidoRepository;
import pe.idat.edu.losangeles.service.pedido.PedidoService;

/**
 *
 * @author Sebastian
 */
@Service
public class PedidoServiceImpl implements PedidoService{

    @Autowired
     private PedidoRepository repositorio;

    @Override
    public List<PedidoEntity> findAll() {
      return repositorio.findAll();        
    }

    @Override
    public List<PedidoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    
    @Override
    public PedidoEntity add(PedidoEntity p) {
        return repositorio.save(p);
    }

//    @Override
//    public Optional<PedidoEntity> findById(Long id) {
//        return repositorio.findById(id);
//    }

    @Override
    public PedidoEntity update(PedidoEntity p) {
        PedidoEntity objpedido=repositorio.getById(p.getIdpedido());
        BeanUtils.copyProperties(p, objpedido);
        return repositorio.save(objpedido);
    }

    @Override
    public PedidoEntity delete(PedidoEntity p) {
        PedidoEntity objpedido=repositorio.getById(p.getIdpedido());
        objpedido.setEstado(false);
        return repositorio.save(objpedido);
    }

    @Override
    public PedidoEntity enable(PedidoEntity p) {
        PedidoEntity objpedido=repositorio.getById(p.getIdpedido());
        objpedido.setEstado(true);
        return repositorio.save(objpedido);
    }

    @Override
    public PedidoEntity findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
