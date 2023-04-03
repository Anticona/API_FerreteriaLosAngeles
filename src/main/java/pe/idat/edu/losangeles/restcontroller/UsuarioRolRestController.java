
package pe.idat.edu.losangeles.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.edu.losangeles.entity.dto.seguridad.UsuarioRolDTO;
import pe.idat.edu.losangeles.service.seguridad.UsuarioRolService;


/**
 *
 * @author Sebastian
 */
@RestController
@RequestMapping("/usuariorol")
public class UsuarioRolRestController {

    @Autowired
    private UsuarioRolService servicio;
    
    @GetMapping
    public List<UsuarioRolDTO> findAll(){
    return servicio.findAll();
    }
    
    
    @GetMapping("/{id}")
    public UsuarioRolDTO findById(@PathVariable Long id){
    return servicio.findById(id);
    }
    
    @PostMapping
    public UsuarioRolDTO add(@RequestBody UsuarioRolDTO u){
    return servicio.add(u);
    }
    
    @PutMapping("/{id}")
    public UsuarioRolDTO update(@PathVariable long id,@RequestBody UsuarioRolDTO u){
    u.setIdusuariorol(id);
    return servicio.update(u);
    }

}
