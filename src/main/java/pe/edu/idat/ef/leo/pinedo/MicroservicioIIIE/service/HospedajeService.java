package pe.edu.idat.ef.leo.pinedo.MicroservicioIIIE.service;

import java.util.List;

import pe.edu.idat.ef.leo.pinedo.MicroservicioIIIE.model.Hospedaje;

public interface HospedajeService {
	
	void guardar(Hospedaje usuariocliente);
	void actualizar(Hospedaje usuariocliente);
	void eliminar(Integer id);
	List<Hospedaje> listar();
	Hospedaje obtener(Integer id);

}
