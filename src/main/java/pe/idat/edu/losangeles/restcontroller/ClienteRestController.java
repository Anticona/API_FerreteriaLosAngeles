
package pe.idat.edu.losangeles.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.edu.losangeles.entity.pedido.ClienteEntity;
import pe.idat.edu.losangeles.service.pedido.ClienteService;

/**
 *
 * @author Sebastian
 */
@RestController
@RequestMapping("/cliente")
public class ClienteRestController {

    @Autowired
    private ClienteService servicio;
    
    @GetMapping
    public List<ClienteEntity> findAll(){
        return servicio.findAll();
    }
      
    @GetMapping("/custom")
    public List<ClienteEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ClienteEntity> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public ClienteEntity add(@RequestBody ClienteEntity c){
        return servicio.add(c);
    }
    
    @PutMapping("/{id}")
    public ClienteEntity update(@PathVariable long id,@RequestBody ClienteEntity c){
        c.setIdcliente(id);
        return servicio.update(c);
    }
    
    @DeleteMapping("/{id}")
    public ClienteEntity delete(@PathVariable long id){
        ClienteEntity objcliente = new ClienteEntity();
        objcliente.setIdcliente(id);
        return servicio.delete(ClienteEntity.builder().idcliente(id).build());
    }
}
