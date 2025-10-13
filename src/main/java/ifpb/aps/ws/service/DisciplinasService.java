package ifpb.aps.ws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifpb.aps.ws.model.Disciplinas;
import ifpb.aps.ws.repository.DisciplinasRepository;

@Service
public class DisciplinasService {
	
	@Autowired
	private DisciplinasRepository disciplinasRepository;
	
	public List<Disciplinas> listarDisciplina() {
		return disciplinasRepository.findAll();
	}
	
	public Disciplinas cadastrarDisciplina(Disciplinas disciplina) {
		return disciplinasRepository.save(disciplina);
	}
	
	public Disciplinas atualizarDisciplina(Disciplinas disciplina) {
		return disciplinasRepository.save(disciplina);
	}
	
	public Long deletarDisciplina(Disciplinas disciplinarequest) {
		disciplinasRepository.deleteById(disciplinarequest.getId());
		return (long) 0;
	}
}
