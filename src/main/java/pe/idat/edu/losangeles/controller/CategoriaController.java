
package pe.idat.edu.losangeles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pe.idat.edu.losangeles.entity.pedido.CategoriaEntity;
import pe.idat.edu.losangeles.service.pedido.CategoriaService;

/**
 *
 * @author Sebastian
 */
@Controller
public class CategoriaController {
    
//    @Autowired
//    private CategoriaService serviciocategoria;
//    
//     @GetMapping("/mostrarcategoria")
//    public String MostrarCategoria(Model modelo) {
//        modelo.addAttribute("categorias", serviciocategoria.findAllCustom());
//        return "/categoria/mostrarcategoria";
//    }
//    
//    @GetMapping("/registrocategoria")
//    public String MostrarRegistrarCategoria() {
//        return "/categoria/registrarcategoria";
//    }
//
//    @GetMapping("/actualizocategoria/{id}")
//    public String MostrarActualizarCategoria(@PathVariable Long id, Model modelo) {
//        modelo.addAttribute("categorias", serviciocategoria.findById(id).get());
//        return "/categoria/actualizarcategoria";
//    }
//
//    @GetMapping("/habilitocategoria")
//    public String MostrarHabilitarCategoria(Model modelo) {
//        modelo.addAttribute("categorias", serviciocategoria.findAll());
//        return "/categoria/habilitarcategoria";
//    }
//
//    @ModelAttribute("categoria")
//    public CategoriaEntity ModeloCategoria() {
//        return new CategoriaEntity();
//    }
//
//    @PostMapping("/registrarcategoria")
//    public String RegistroCategoria(@ModelAttribute("categoria") CategoriaEntity c) {
//        serviciocategoria.add(c);
//        return "redirect:/mostrarcategoria?correcto";
//    }
//
//    @PostMapping("/actualizarcategoria/{id}")
//    public String ActualizarCategoria(@PathVariable Long id, @ModelAttribute("categoria") CategoriaEntity c) {
//        serviciocategoria.update(c);
//        return "redirect:/mostrarcategoria?actualizo";
//    }
//
//    @GetMapping("/eliminarcategoria/{id}")
//    public String EliminarCategoria(@PathVariable Long id, Model modelo) {
//        CategoriaEntity objcurso = serviciocategoria.findById(id).get();
//        serviciocategoria.delete(objcurso);
//        return "redirect:/mostrarcategoria?elimino";
//    }
//    
//    @GetMapping("/habilitarcategoria/{id}")
//    public String HabilitarCategoria(@PathVariable Long id, Model modelo) {
//        CategoriaEntity objcurso = serviciocategoria.findById(id).get();
//        serviciocategoria.enable(objcurso);
//        return "redirect:/mostrarcategoria?habilito";
//    }
//
//    @GetMapping("/deshabilitarcategoria/{id}")
//    public String DeshabilitarCategoria(@PathVariable Long id, Model modelo) {
//        CategoriaEntity objcurso = serviciocategoria.findById(id).get();
//        serviciocategoria.delete(objcurso);
//        return "redirect:/mostrarcategoria?deshabilito";
//    }
    
}
