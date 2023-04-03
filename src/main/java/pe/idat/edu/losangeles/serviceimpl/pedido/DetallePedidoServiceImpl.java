
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.pedido.DetallePedidoEntity;
import pe.idat.edu.losangeles.repository.pedido.DetallePedidoRepository;
import pe.idat.edu.losangeles.service.pedido.DetallePedidoService;

/**
 *
 * @author Sebastian
 */
@Service
public class DetallePedidoServiceImpl implements DetallePedidoService{

    @Autowired 
    private DetallePedidoRepository repositorio;
    
    @Override
    public List<DetallePedidoEntity> findAll() {
        return repositorio.findAll(); 
    }

    @Override
    public List<DetallePedidoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public DetallePedidoEntity add(DetallePedidoEntity d) {
        return repositorio.save(d);
    }

//    @Override
//    public Optional<DetallePedidoEntity> findById(Long id) {
//        return repositorio.findById(id);
//    }

    @Override
    public DetallePedidoEntity update(DetallePedidoEntity d) {
        DetallePedidoEntity objdetalle=repositorio.getById(d.getIddetallepedido());
        BeanUtils.copyProperties(d, objdetalle);
        return repositorio.save(objdetalle);
    }

    @Override
    public DetallePedidoEntity delete(DetallePedidoEntity d) {
        DetallePedidoEntity objdetalle=repositorio.getById(d.getIddetallepedido());
        objdetalle.setEstado(false);
        return repositorio.save(objdetalle);
    }

    @Override
    public DetallePedidoEntity enable(DetallePedidoEntity d) {
        DetallePedidoEntity objdetalle=repositorio.getById(d.getIddetallepedido());
        objdetalle.setEstado(true);
        return repositorio.save(objdetalle);
    }

    @Override
    public DetallePedidoEntity findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
