package pe.edu.idat.ef.leo.pinedo.MicroservicioIIIE.repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="reserva_hospedaje")
public class ReservaHospedaje {
	
	@Id
	private ReservaHospedaje fk = new ReservaHospedaje();

}
