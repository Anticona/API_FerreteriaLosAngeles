
package pe.idat.edu.losangeles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Sebastian
 */
@Controller
public class InicioController {

    @GetMapping()
    public String Inicio(){
        return "index";
    }
    
    @GetMapping("/principal")
    public String MenuPrincipal(){
        return "principal";
    }
}
