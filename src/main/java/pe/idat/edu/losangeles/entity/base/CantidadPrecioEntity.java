
package pe.idat.edu.losangeles.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
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
public class CantidadPrecioEntity extends EstadoEntity{
    
    @Column(name="cantidad", nullable = false)
    private int cantidad;
    @Column(name="precio", nullable = false)
    private double precio;
}
