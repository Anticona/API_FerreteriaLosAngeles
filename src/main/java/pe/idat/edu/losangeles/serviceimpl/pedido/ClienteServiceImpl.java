
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.pedido.ClienteEntity;
import pe.idat.edu.losangeles.repository.pedido.ClienteRepository;
import pe.idat.edu.losangeles.service.pedido.ClienteService;

/**
 *
 * @author Sebastian
 */
@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
     private ClienteRepository repositorio;

    @Override
    public List<ClienteEntity> findAll() {
      return repositorio.findAll();        
    }

    @Override
    public List<ClienteEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    
    @Override
    public ClienteEntity add(ClienteEntity c) {
        return repositorio.save(c);
    }

    @Override
    public Optional<ClienteEntity> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public ClienteEntity update(ClienteEntity c) {
        ClienteEntity objcliente=repositorio.getById(c.getIdcliente());
        BeanUtils.copyProperties(c, objcliente);
        return repositorio.save(objcliente);
    }

    @Override
    public ClienteEntity delete(ClienteEntity c) {
        ClienteEntity objcliente=repositorio.getById(c.getIdcliente());
        objcliente.setEstado(false);
        return repositorio.save(objcliente);
    }

}
