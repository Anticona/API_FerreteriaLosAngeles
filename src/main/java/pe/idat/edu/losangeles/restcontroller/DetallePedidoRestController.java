
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
import pe.idat.edu.losangeles.entity.pedido.DetallePedidoEntity;
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
    public List<DetallePedidoEntity> findAll(){
        return servicio.findAll();
    }
      
    @GetMapping("/custom")
    public List<DetallePedidoEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<DetallePedidoEntity> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public DetallePedidoEntity add(@RequestBody DetallePedidoEntity d){
        return servicio.add(d);
    }
    
    @PutMapping("/{id}")
    public DetallePedidoEntity update(@PathVariable long id,@RequestBody DetallePedidoEntity d){
        d.setIddetallepedido(id);
        return servicio.update(d);
    }
    
    @DeleteMapping("/{id}")
    public DetallePedidoEntity delete(@PathVariable long id){
        DetallePedidoEntity objproducto = new DetallePedidoEntity();
        objproducto.setIddetallepedido(id);
        return servicio.delete(DetallePedidoEntity.builder().iddetallepedido(id).build());
    }
}
