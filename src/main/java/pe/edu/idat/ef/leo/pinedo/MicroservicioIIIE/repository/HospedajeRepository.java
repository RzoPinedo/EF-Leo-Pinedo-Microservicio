package pe.edu.idat.ef.leo.pinedo.MicroservicioIIIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.idat.ef.leo.pinedo.MicroservicioIIIE.model.Hospedaje;

@Repository
public interface HospedajeRepository extends JpaRepository<Hospedaje, Integer>{
	
}
