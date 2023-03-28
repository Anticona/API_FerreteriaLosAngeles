
package pe.idat.edu.losangeles.entity.pedido;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
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
@Entity(name = "UsuarioRolEntity")
@Table(name = "usuariorol")
public class UsuarioRolEntity implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="idusuariorol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idusuariorol;

    @ManyToOne
    @JoinColumn(name="idusuario", nullable = false)
    private UsuarioEntity idusuario;
    
    @ManyToOne
    @JoinColumn(name="idrol", nullable = false)
    private RolEntity idrol;
}
