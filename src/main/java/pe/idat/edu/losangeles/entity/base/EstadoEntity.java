
package pe.idat.edu.losangeles.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
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
@MappedSuperclass
public class EstadoEntity {
    @Column(name="estado", nullable = false)
    private boolean estado;
}
