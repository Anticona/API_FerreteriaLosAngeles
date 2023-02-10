
package pe.idat.edu.losangeles.entity.pedido;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.idat.edu.losangeles.entity.base.NombreEntity;

/**
 *
 * @author Sebastian
 */
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity(name = "MarcaEntity")
@Table(name = "marca")
public class MarcaEntity extends NombreEntity implements Serializable{

    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="idmarca")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idmarca;
}
