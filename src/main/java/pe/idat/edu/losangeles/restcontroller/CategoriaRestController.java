
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
import pe.idat.edu.losangeles.entity.dto.pedido.CategoriaDTO;
import pe.idat.edu.losangeles.mapper.pedido.CategoriaMapper;
import pe.idat.edu.losangeles.service.pedido.CategoriaService;

/**
 *
 * @author Sebastian
 */
@RestController
@RequestMapping("/categoria")
public class CategoriaRestController {

@Autowired
    private CategoriaService servicio;

    private CategoriaMapper mapper;

    @GetMapping
    public List<CategoriaDTO> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<CategoriaDTO> findAllCustom() {
        return servicio.findAllCustom();
    }

    @PostMapping
    public CategoriaDTO add(@RequestBody CategoriaDTO c) {
        return servicio.add(c);
    }

    @GetMapping("/{id}")
    public CategoriaDTO findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PutMapping("/{id}")
    public CategoriaDTO update(@PathVariable long id, @RequestBody CategoriaDTO c) {
        c.getIdcategoria();
        return servicio.update(c);
    }

    @DeleteMapping("/{id}")
    public CategoriaDTO delete(@PathVariable long id) {
        CategoriaDTO objcategoria = new CategoriaDTO();
        objcategoria.setIdcategoria(id);
        return servicio.delete(CategoriaDTO.builder().idcategoria(id).build());
    }

    @PutMapping("/enable/{id}")
    public CategoriaDTO enable(@PathVariable long id) {
        CategoriaDTO objcategoria = new CategoriaDTO();
        objcategoria.setIdcategoria(id);
        return servicio.enable(CategoriaDTO.builder().idcategoria(id).build());
    }
}
