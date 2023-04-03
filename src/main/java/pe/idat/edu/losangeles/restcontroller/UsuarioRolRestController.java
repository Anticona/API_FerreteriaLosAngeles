
package pe.idat.edu.losangeles.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.edu.losangeles.entity.seguridad.UsuarioRolEntity;
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
    public List<UsuarioRolEntity> findAll(){
    return servicio.findAll();
    }
    
    
//    @GetMapping("/{id}")
//    public Optional<UsuarioRolEntity> findById(@PathVariable Long id){
//    return servicio.findById(id);
//    }
    
    @PostMapping
    public UsuarioRolEntity add(@RequestBody UsuarioRolEntity u){
    return servicio.add(u);
    }
    
    @PutMapping("/{id}")
    public UsuarioRolEntity update(@PathVariable long id,@RequestBody UsuarioRolEntity u){
    u.setIdusuariorol(id);
    return servicio.update(u);
    }

}
