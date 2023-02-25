
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
import pe.idat.edu.losangeles.entity.pedido.EmpleadoEntity;
import pe.idat.edu.losangeles.service.pedido.EmpleadoService;

/**
 *
 * @author Sebastian
 */
@RestController
@RequestMapping("/empleado")
public class EmpleadoRestController {

    @Autowired
    private EmpleadoService servicio;
    
    @GetMapping
    public List<EmpleadoEntity> findAll(){
        return servicio.findAll();
    }
      
    @GetMapping("/custom")
    public List<EmpleadoEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<EmpleadoEntity> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public EmpleadoEntity add(@RequestBody EmpleadoEntity e){
        return servicio.add(e);
    }
    
    @PutMapping("/{id}")
    public EmpleadoEntity update(@PathVariable long id,@RequestBody EmpleadoEntity e){
        e.setIdempleado(id);
        return servicio.update(e);
    }
    
    @DeleteMapping("/{id}")
    public EmpleadoEntity delete(@PathVariable long id){
        EmpleadoEntity objempleado = new EmpleadoEntity();
        objempleado.setIdempleado(id);
        return servicio.delete(EmpleadoEntity.builder().idempleado(id).build());
    }
}
