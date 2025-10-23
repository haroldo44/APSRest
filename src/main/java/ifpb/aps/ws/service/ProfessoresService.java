package ifpb.aps.ws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import ifpb.aps.ws.model.Professores;
import ifpb.aps.ws.repository.ProfessoresRepository;

@Service
public class ProfessoresService {
	
	@Autowired
	private ProfessoresRepository professoresRepository;
	
	@GetMapping
	public List<Professores> listarProfessores() {
		return professoresRepository.findAll();
	}
	
	public Professores cadastrarProfessor(Professores professor) {
		return professoresRepository.save(professor);
	}
	
	public Professores atualizarProfessor(Professores professor) {
		return professoresRepository.save(professor);
	}
	
	public Long deletarProfessor(Professores professorrequest) {
		professoresRepository.deleteById(professorrequest.getMatricula());
		return (long) 0;
	}
}
