
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
import pe.idat.edu.losangeles.entity.dto.pedido.DetallePedidoDTO;
import pe.idat.edu.losangeles.service.pedido.DetallePedidoService;

/**
 *
 * @author Sebastian
 */
@RestController
@RequestMapping("/detallepedido")
public class DetallePedidoRestController {

    @Autowired
    private DetallePedidoService servicio;
    
    @GetMapping
    public List<DetallePedidoDTO> findAll(){
        return servicio.findAll();
    }
      
    @GetMapping("/custom")
    public List<DetallePedidoDTO> findAllCustom(){
        return servicio.findAllCustom();
    }
    
//    @GetMapping("/{id}")
//    public Optional<DetallePedidoEntity> findById(@PathVariable Long id){
//        return servicio.findById(id);
//    }
    
    @PostMapping
    public DetallePedidoDTO add(@RequestBody DetallePedidoDTO d){
        return servicio.add(d);
    }
    
    @PutMapping("/{id}")
    public DetallePedidoDTO update(@PathVariable long id,@RequestBody DetallePedidoDTO d){
        d.setIddetallepedido(id);
        return servicio.update(d);
    }
    
    @DeleteMapping("/{id}")
    public DetallePedidoDTO delete(@PathVariable long id){
        DetallePedidoDTO objproducto = new DetallePedidoDTO();
        objproducto.setIddetallepedido(id);
        return servicio.delete(DetallePedidoDTO.builder().iddetallepedido(id).build());
    }
}
