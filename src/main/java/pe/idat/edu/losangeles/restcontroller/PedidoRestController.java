
package pe.idat.edu.losangeles.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.edu.losangeles.entity.dto.pedido.PedidoDTO;
import pe.idat.edu.losangeles.service.pedido.PedidoService;

/**
 *
 * @author Sebastian
 */
@RestController
@RequestMapping("/pedido")
public class PedidoRestController {

    @Autowired
    private PedidoService servicio;
    
    @GetMapping
    public List<PedidoDTO> findAll(){
        return servicio.findAll();
    }
      
    @GetMapping("/custom")
    public List<PedidoDTO> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public PedidoDTO findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public PedidoDTO add(@RequestBody PedidoDTO p){
        return servicio.add(p);
    }
    
    @PutMapping("/{id}")
    public PedidoDTO update(@PathVariable long id,@RequestBody PedidoDTO p){
        p.setIdpedido(id);
        return servicio.update(p);
    }
    
    @DeleteMapping("/{id}")
    public PedidoDTO delete(@PathVariable long id){
        PedidoDTO objpedido = new PedidoDTO();
        objpedido.setIdpedido(id);
        return servicio.delete(PedidoDTO.builder().idpedido(id).build());
    }
    
    @PutMapping("/enable/{id}")
    public PedidoDTO enable(@PathVariable long id) {
        PedidoDTO objpedido = new PedidoDTO();
        objpedido.setIdpedido(id);
        return servicio.enable(PedidoDTO.builder().idpedido(id).build());
    }
}
