package ec.edu.ups.demoautomovil.interfaces;

import ec.edu.ups.demoautomovil.model.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutomovilRepository extends JpaRepository<Automovil, Long> {
}
