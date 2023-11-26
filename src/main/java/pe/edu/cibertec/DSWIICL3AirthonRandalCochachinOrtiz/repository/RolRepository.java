package pe.edu.cibertec.DSWIICL3AirthonRandalCochachinOrtiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWIICL3AirthonRandalCochachinOrtiz.model.bd.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

    Rol findByNomrol(String nombrerol);
}