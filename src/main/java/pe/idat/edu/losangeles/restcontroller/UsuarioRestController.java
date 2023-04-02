
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
import pe.idat.edu.losangeles.entity.seguridad.UsuarioEntity;
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
    public List<UsuarioEntity> findAll(){
        return servicio.findAll();
    }
      
    @GetMapping("/custom")
    public List<UsuarioEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<UsuarioEntity> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public UsuarioEntity add(@RequestBody UsuarioEntity u){
        return servicio.add(u);
    }
    
    @PutMapping("/{id}")
    public UsuarioEntity update(@PathVariable long id,@RequestBody UsuarioEntity u){
        u.setIdusuario(id);
        return servicio.update(u);
    }
    
    @DeleteMapping("/{id}")
    public UsuarioEntity delete(@PathVariable long id){
        UsuarioEntity objusuario = new UsuarioEntity();
        objusuario.setIdusuario(id);
        return servicio.delete(UsuarioEntity.builder().idusuario(id).build());
    }
}
