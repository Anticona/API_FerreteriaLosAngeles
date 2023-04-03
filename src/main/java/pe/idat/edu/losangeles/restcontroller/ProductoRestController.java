
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
import pe.idat.edu.losangeles.entity.dto.pedido.ProductoDTO;
import pe.idat.edu.losangeles.service.pedido.ProductoService;


/**
 *
 * @author Sebastian
 */
@RestController
@RequestMapping("/producto")
public class ProductoRestController {

    @Autowired
    private ProductoService servicio;
    
    @GetMapping
    public List<ProductoDTO> findAll(){
        return servicio.findAll();
    }
      
    @GetMapping("/custom")
    public List<ProductoDTO> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public ProductoDTO findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public ProductoDTO add(@RequestBody ProductoDTO p){
        return servicio.add(p);
    }
    
    @PutMapping("/{id}")
    public ProductoDTO update(@PathVariable long id,@RequestBody ProductoDTO p){
        p.setIdproducto(id);
        return servicio.update(p);
    }
    
    @DeleteMapping("/{id}")
    public ProductoDTO delete(@PathVariable long id){
        ProductoDTO objproducto = new ProductoDTO();
        objproducto.setIdproducto(id);
        return servicio.delete(ProductoDTO.builder().idproducto(id).build());
    }
}
