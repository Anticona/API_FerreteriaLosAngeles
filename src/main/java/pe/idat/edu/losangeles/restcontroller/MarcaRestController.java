
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
import pe.idat.edu.losangeles.entity.dto.pedido.MarcaDTO;
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
    public List<MarcaDTO> findAll(){
        return servicio.findAll();
    }
      
    @GetMapping("/custom")
    public List<MarcaDTO> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public MarcaDTO findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public MarcaDTO add(@RequestBody MarcaDTO m){
        return servicio.add(m);
    }
    
    @PutMapping("/{id}")
    public MarcaDTO update(@PathVariable long id,@RequestBody MarcaDTO m){
        m.setIdmarca(id);
        return servicio.update(m);
    }
    
    @DeleteMapping("/{id}")
    public MarcaDTO delete(@PathVariable long id){
        MarcaDTO objmarca = new MarcaDTO();
        objmarca.setIdmarca(id);
        return servicio.delete(MarcaDTO.builder().idmarca(id).build());
    }
}
