
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
public class DatosEntity extends EstadoEntity{
    
    @Column(name="prnombre",length = 40,nullable = false)
    @NotEmpty(message = "Debe de ingresar su primer nombre")
    @Size(min=3,max=40,message = "el nombre debe tener como minimo {min} y maximo {max} letras")
    private String prnombre;
    @Column(name="sgnombre",length = 40,nullable = false)
    @NotEmpty(message = "Debe de ingresar su segundo nombre")
    @Size(min=3,max=40,message = "el nombre debe tener como minimo {min} y maximo {max} letras")
    private String sgnombre;
    @Column(name="ptapellido",length = 40,nullable = false)
    @NotEmpty(message = "Debe de ingresar su apellido paterno")
    @Size(min=3,max=40,message = "el apellido debe tener como minimo {min} y maximo {max} letras")
    private String ptapellido;
    @Column(name="mtapellido",length = 40,nullable = false)
    @NotEmpty(message = "Debe de ingresar su apellido materno")
    @Size(min=3,max=40,message = "el apellido debe tener como minimo {min} y maximo {max} letras")
    private String mtapellido;
    @Column(name="email",length = 60,nullable = false)
    @NotEmpty(message = "Debe de ingresar su email")
    @Size(min=10,max=60,message = "el email debe tener como maximo {max} letras")
    private String email;
    @Column(name="dni",length = 8,nullable = false)
    @NotEmpty(message = "Debe de ingresar su dni")
    @Size(min=8,max=8,message = "el dni debe tener como {max} digitos")
    private int dni;
}
