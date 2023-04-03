
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
import pe.idat.edu.losangeles.entity.dto.seguridad.RolDTO;
import pe.idat.edu.losangeles.service.seguridad.RolService;

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
    public List<RolDTO> findAll(){
        return servicio.findAll();
    }
      
    @GetMapping("/custom")
    public List<RolDTO> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public RolDTO findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public RolDTO add(@RequestBody RolDTO r){
        return servicio.add(r);
    }
    
    @PutMapping("/{id}")
    public RolDTO update(@PathVariable long id,@RequestBody RolDTO r){
        r.setIdrol(id);
        return servicio.update(r);
    }
    
    @DeleteMapping("/{id}")
    public RolDTO delete(@PathVariable long id){
        RolDTO objrol = new RolDTO();
        objrol.setIdrol(id);
        return servicio.delete(RolDTO.builder().idrol(id).build());
    }
}
