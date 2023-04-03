
package pe.idat.edu.losangeles.entity.dto.pedido;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.idat.edu.losangeles.entity.pedido.CategoriaEntity;
import pe.idat.edu.losangeles.entity.pedido.MarcaEntity;

/**
 *
 * @author Sebastian
 */
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonPropertyOrder({"idproducto","nmproducto","caracteristicas","cantidad","precio","estado","idmarca","idcategoria"})
public class ProductoDTO {
    private Long idproducto;
    private String nmproducto;
    private String caracteristicas;
    private int cantidad;
    private double precio;
    private boolean estado;
    private MarcaEntity idmarca;
    private CategoriaEntity idcategoria;
    
    
}
