
package pe.idat.edu.losangeles.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author Sebastian
 */

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@MappedSuperclass
public class NombreEntity extends EstadoEntity{
    @Column(name="nombre",length = 50, nullable = false)
    @NotEmpty(message = "Debe de ingresar el nombre")
    @Size(min=5,max=50,message = "El nombre debe de tener como minimo {min} y maximo {max}")
    private String nombre;
}
