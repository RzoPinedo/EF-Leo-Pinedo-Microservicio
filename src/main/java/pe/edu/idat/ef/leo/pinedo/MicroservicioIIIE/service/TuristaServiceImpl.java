package pe.edu.idat.ef.leo.pinedo.MicroservicioIIIE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.idat.ef.leo.pinedo.MicroservicioIIIE.model.Turista;
import pe.edu.idat.ef.leo.pinedo.MicroservicioIIIE.repository.TuristaRepository;

@Service
public class TuristaServiceImpl implements TuristaService {
	
	@Autowired
	private TuristaRepository repositorio;

	@Override
	public void guardar(Turista turista) {
		repositorio.save(turista);

	}

	@Override
	public void actualizar(Turista turista) {
		repositorio.saveAndFlush(turista);

	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);

	}

	@Override
	public List<Turista> listar() {
		return repositorio.findAll();
	}

	@Override
	public Turista obtener(Integer id) {
		return repositorio.findById(id).orElse(null);
	}

}
