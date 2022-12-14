package pe.edu.idat.ef.leo.pinedo.MicroservicioIIIE.service;

import java.util.List;

import pe.edu.idat.ef.leo.pinedo.MicroservicioIIIE.model.Turista;

public interface TuristaService {
	
	void guardar(Turista turista);
	void actualizar(Turista turista);
	void eliminar(Integer id);
	List<Turista> listar();
	Turista obtener(Integer id);

}
