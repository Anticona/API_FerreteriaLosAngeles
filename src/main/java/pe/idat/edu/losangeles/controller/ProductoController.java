
package pe.idat.edu.losangeles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Sebastian
 */
@Controller
public class ProductoController {

    @GetMapping("/mostrarproducto")
    public String Producto(){
        return "/producto/mostrarproducto";
    }
}
