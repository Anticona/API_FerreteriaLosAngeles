
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
import pe.idat.edu.losangeles.entity.dto.pedido.DistritoDTO;
import pe.idat.edu.losangeles.service.pedido.DistritoService;

/**
 *
 * @author Sebastian
 */
@RestController
@RequestMapping("/distrito")
public class DistritoRestController {

    @Autowired
    private DistritoService servicio;
    
    @GetMapping
    public List<DistritoDTO> findAll(){
        return servicio.findAll();
    }
      
    @GetMapping("/custom")
    public List<DistritoDTO> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public DistritoDTO findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public DistritoDTO add(@RequestBody DistritoDTO d){
        return servicio.add(d);
    }
    
    @PutMapping("/{id}")
    public DistritoDTO update(@PathVariable long id,@RequestBody DistritoDTO d){
        d.setIddistrito(id);
        return servicio.update(d);
    }
    
    @DeleteMapping("/{id}")
    public DistritoDTO delete(@PathVariable long id){
        DistritoDTO objdistrito = new DistritoDTO();
        objdistrito.setIddistrito(id);
        return servicio.delete(DistritoDTO.builder().iddistrito(id).build());
    }
}
