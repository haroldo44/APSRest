package ifpb.aps.ws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifpb.aps.ws.model.Curso;
import ifpb.aps.ws.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;
	
	public List<Curso> listarCurso() {
		return cursoRepository.findAll();
	}
	
	public Curso cadastrarCurso(Curso curso) {
		return cursoRepository.save(curso);
	}
	
	public Curso atualizarCurso(Curso curso) {
		return cursoRepository.save(curso);
	}
	
	public Long deletarCurso(Curso cursorequest) {
		cursoRepository.deleteById(cursorequest.getCodigo());
		return (long) 0;
	}
}
