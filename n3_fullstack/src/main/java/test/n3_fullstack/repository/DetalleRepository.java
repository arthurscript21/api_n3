package test.n3_fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.n3_fullstack.Entity.Detalle;

/**
 *
 * @author Duoc
 */
public interface DetalleRepository extends JpaRepository<Detalle, Integer> {    
    
    public Detalle savDetalle(Detalle d);
}