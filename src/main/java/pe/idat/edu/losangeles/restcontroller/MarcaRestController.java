
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
import pe.idat.edu.losangeles.entity.pedido.MarcaEntity;
import pe.idat.edu.losangeles.service.pedido.MarcaService;

/**
 *
 * @author Sebastian
 */
@RestController
@RequestMapping("/marca")
public class MarcaRestController {

    @Autowired
    private MarcaService servicio;
    
    @GetMapping
    public List<MarcaEntity> findAll(){
        return servicio.findAll();
    }
      
    @GetMapping("/custom")
    public List<MarcaEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<MarcaEntity> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public MarcaEntity add(@RequestBody MarcaEntity m){
        return servicio.add(m);
    }
    
    @PutMapping("/{id}")
    public MarcaEntity update(@PathVariable long id,@RequestBody MarcaEntity m){
        m.setIdmarca(id);
        return servicio.update(m);
    }
    
    @DeleteMapping("/{id}")
    public MarcaEntity delete(@PathVariable long id){
        MarcaEntity objmarca = new MarcaEntity();
        objmarca.setIdmarca(id);
        return servicio.delete(MarcaEntity.builder().idmarca(id).build());
    }
}
