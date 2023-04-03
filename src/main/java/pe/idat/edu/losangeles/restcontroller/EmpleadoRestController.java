
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
import pe.idat.edu.losangeles.entity.dto.pedido.EmpleadoDTO;
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
    public List<EmpleadoDTO> findAll(){
        return servicio.findAll();
    }
      
    @GetMapping("/custom")
    public List<EmpleadoDTO> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public EmpleadoDTO findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public EmpleadoDTO add(@RequestBody EmpleadoDTO e){
        return servicio.add(e);
    }
    
    @PutMapping("/{id}")
    public EmpleadoDTO update(@PathVariable long id,@RequestBody EmpleadoDTO e){
        e.setIdempleado(id);
        return servicio.update(e);
    }
    
    @DeleteMapping("/{id}")
    public EmpleadoDTO delete(@PathVariable long id){
        EmpleadoDTO objempleado = new EmpleadoDTO();
        objempleado.setIdempleado(id);
        return servicio.delete(EmpleadoDTO.builder().idempleado(id).build());
    }
}
