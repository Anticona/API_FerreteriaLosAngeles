
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
import pe.idat.edu.losangeles.entity.dto.seguridad.UsuarioDTO;
import pe.idat.edu.losangeles.service.seguridad.UsuarioService;


/**
 *
 * @author Sebastian
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {

    @Autowired
    private UsuarioService servicio;
    
    @GetMapping
    public List<UsuarioDTO> findAll(){
        return servicio.findAll();
    }
      
    @GetMapping("/custom")
    public List<UsuarioDTO> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public UsuarioDTO findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public UsuarioDTO add(@RequestBody UsuarioDTO u){
        return servicio.add(u);
    }
    
    @PutMapping("/{id}")
    public UsuarioDTO update(@PathVariable long id,@RequestBody UsuarioDTO u){
        u.setIdusuario(id);
        return servicio.update(u);
    }
    
    @DeleteMapping("/{id}")
    public UsuarioDTO delete(@PathVariable long id){
        UsuarioDTO objusuario = new UsuarioDTO();
        objusuario.setIdusuario(id);
        return servicio.delete(UsuarioDTO.builder().idusuario(id).build());
    }
}
