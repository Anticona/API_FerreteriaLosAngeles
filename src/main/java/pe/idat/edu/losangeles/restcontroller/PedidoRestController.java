
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
import pe.idat.edu.losangeles.entity.pedido.PedidoEntity;
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
    public List<PedidoEntity> findAll(){
        return servicio.findAll();
    }
      
    @GetMapping("/custom")
    public List<PedidoEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
//    @GetMapping("/{id}")
//    public Optional<PedidoEntity> findById(@PathVariable Long id){
//        return servicio.findById(id);
//    }
    
    @PostMapping
    public PedidoEntity add(@RequestBody PedidoEntity p){
        return servicio.add(p);
    }
    
    @PutMapping("/{id}")
    public PedidoEntity update(@PathVariable long id,@RequestBody PedidoEntity p){
        p.setIdpedido(id);
        return servicio.update(p);
    }
    
    @DeleteMapping("/{id}")
    public PedidoEntity delete(@PathVariable long id){
        PedidoEntity objpedido = new PedidoEntity();
        objpedido.setIdpedido(id);
        return servicio.delete(PedidoEntity.builder().idpedido(id).build());
    }
}
