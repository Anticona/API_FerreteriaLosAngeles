
package pe.idat.edu.losangeles.serviceimpl.pedido;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.losangeles.entity.dto.pedido.ClienteDTO;
import pe.idat.edu.losangeles.entity.pedido.ClienteEntity;
import pe.idat.edu.losangeles.repository.pedido.ClienteRepository;
import pe.idat.edu.losangeles.service.pedido.ClienteService;
import pe.idat.edu.losangeles.util.mapper.GenericoMapper;

/**
 *
 * @author Sebastian
 */
@RequiredArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
     private ClienteRepository repositorio;
    
    @Autowired
    private GenericoMapper<ClienteEntity, ClienteDTO> mapper;

    @Override
    public List<ClienteDTO> findAll() {
        List<ClienteEntity> lista = repositorio.findAll();
        return mapper.ConvertirListaDTO(lista, ClienteDTO.class);
    }

    @Override
    public List<ClienteDTO> findAllCustom() {
        List<ClienteEntity> lista = repositorio.findAllCustom();
        return mapper.ConvertirListaDTO(lista, ClienteDTO.class);
    }

    @Override
    public ClienteDTO add(ClienteDTO c) {
        ClienteEntity objcliente = mapper.ConvertirEntity(c, ClienteEntity.class);
        return mapper.ConvertirDTO(repositorio.save(objcliente), ClienteDTO.class);
    }

    @Override
    public ClienteDTO findById(Long id) {
        ClienteEntity lista = repositorio.findById(id).get();
        return mapper.ConvertirDTO(lista, ClienteDTO.class);    
    }
    
    @Override
    public ClienteDTO update(ClienteDTO c) {
        ClienteEntity objcliente = repositorio.getById(c.getIdcliente());
        BeanUtils.copyProperties(c, objcliente);
        return mapper.ConvertirDTO(repositorio.save(objcliente), ClienteDTO.class);
    }

    @Override
    public ClienteDTO delete(ClienteDTO c) {
        ClienteEntity objcliente = repositorio.getById(c.getIdcliente());
        objcliente.setEstado(false);
        return mapper.ConvertirDTO(repositorio.save(objcliente), ClienteDTO.class);
    }

    @Override
    public ClienteDTO enable(ClienteDTO c) {
        ClienteEntity objcliente = repositorio.getById(c.getIdcliente());
        objcliente.setEstado(true);
        return mapper.ConvertirDTO(repositorio.save(objcliente), ClienteDTO.class);
    }

    

}
