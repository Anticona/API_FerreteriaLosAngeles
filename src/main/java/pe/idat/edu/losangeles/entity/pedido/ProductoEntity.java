
package pe.idat.edu.losangeles.entity.pedido;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.idat.edu.losangeles.entity.base.CantidadPrecioEntity;

/**
 *
 * @author Sebastian
 */
@SuperBuilder 
@NoArgsConstructor 
@AllArgsConstructor 
@Data
@EqualsAndHashCode(callSuper = false)
@Entity(name="ProductoEntity") 
@Table(name="producto") 
public class ProductoEntity extends CantidadPrecioEntity implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="idproducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idproducto;
    @Column(name="nmproducto",length = 80, nullable = false)
    @NotEmpty(message = "Debe de ingresar el nombre del producto")
    @Size(min=4,max=80,message = "El nombre del producto debe de tener como minimo {min} y maximo {max} letras")
    private String nmproducto;
    @Column(name="caracteristicas",length = 400, nullable = false)
    @NotEmpty(message = "Debe de ingresar la caracteristica del producto")
    @Size(min=4,max=400,message = "La caracteristica debe de tener como minimo {min} y maximo {max} letras")
    private String caracteristicas;

    @ManyToOne
    @JoinColumn(name="idcategoria", nullable = false)
    private CategoriaEntity idcategoria;
    
    @ManyToOne
    @JoinColumn(name="idmarca", nullable = false)
    private MarcaEntity idmarca;
}
