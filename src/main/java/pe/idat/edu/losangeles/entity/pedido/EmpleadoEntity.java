
package pe.idat.edu.losangeles.entity.pedido;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.idat.edu.losangeles.entity.base.DatosEntity;

/**
 *
 * @author Sebastian
 */
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity(name = "EmpleadoEntity")
@Table(name = "empleado")
public class EmpleadoEntity extends DatosEntity implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="idempleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idempleado;
    @Column(name="user",length = 20, nullable = false)
    @NotEmpty(message = "Debe de ingresar un nombre de usuario")
    @Size(min=5,max=20,message = "El nombre de usuario debe de tener como minimo {min} y maximo {max} letras")
    private String user;
    @Column(name="password",length = 40, nullable = false)
    @NotEmpty(message = "Debe de ingresar una contraseña")
    @Size(min=5,max=20,message = "La contraseña debe de tener como minimo {min} y maximo {max} letras")
    private String password;
    
    @ManyToOne
    @JoinColumn(name="idrol", nullable = false)
    private RolEntity idrol;
}
