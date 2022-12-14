package pe.edu.idat.ef.leo.pinedo.MicroservicioIIIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.idat.ef.leo.pinedo.MicroservicioIIIE.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
