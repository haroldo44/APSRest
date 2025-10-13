package ifpb.aps.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifpb.aps.ws.model.Disciplinas;
import ifpb.aps.ws.model.Professores;
import ifpb.aps.ws.service.DisciplinasService;
import ifpb.aps.ws.service.ProfessoresService;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinasController {
	
	@Autowired
	private DisciplinasService disciplinaService;
	
	@GetMapping
	public List<Disciplinas> listarDisciplinas() {
		return disciplinaService.listarDisciplina();
	}
	
	@PostMapping
	public Disciplinas cadastrarDisciplina(@RequestBody Disciplinas disciplina) {
		return disciplinaService.cadastrarDisciplina(disciplina);
	}
	
	@PutMapping
	public Disciplinas atualizarDisciplina(@RequestBody Disciplinas disciplina) {
		return disciplinaService.atualizarDisciplina(disciplina);
	}
	
	@DeleteMapping
	public Long deletarDisciplina(@RequestBody Disciplinas disciplina) {
		return disciplinaService.deletarDisciplina(disciplina);
	}
}
