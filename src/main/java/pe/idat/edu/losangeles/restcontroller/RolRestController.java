
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
import pe.idat.edu.losangeles.entity.pedido.RolEntity;
import pe.idat.edu.losangeles.service.pedido.RolService;

/**
 *
 * @author Sebastian
 */

@RestController
@RequestMapping("/rol")
public class RolRestController {

    @Autowired
    private RolService servicio;
    
    @GetMapping
    public List<RolEntity> findAll(){
        return servicio.findAll();
    }
      
    @GetMapping("/custom")
    public List<RolEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<RolEntity> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public RolEntity add(@RequestBody RolEntity r){
        return servicio.add(r);
    }
    
    @PutMapping("/{id}")
    public RolEntity update(@PathVariable long id,@RequestBody RolEntity r){
        r.setIdrol(id);
        return servicio.update(r);
    }
    
    @DeleteMapping("/{id}")
    public RolEntity delete(@PathVariable long id){
        RolEntity objrol = new RolEntity();
        objrol.setIdrol(id);
        return servicio.delete(RolEntity.builder().idrol(id).build());
    }
}
