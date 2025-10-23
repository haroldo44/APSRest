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

import ifpb.aps.ws.model.Professores;
import ifpb.aps.ws.service.ProfessoresService;

@RestController
@RequestMapping("/professores")
public class ProfessoresController {

	@Autowired
	private ProfessoresService professoresService;
	
	@GetMapping
	public List<Professores> listarProfessor() {
		return professoresService.listarProfessores();
	}
	
	@PostMapping
	public Professores cadastrarProfessor(@RequestBody Professores professor) {
		return professoresService.cadastrarProfessor(professor);
	}
	
	@PutMapping
	public Professores atualizarProfessor(@RequestBody Professores professor) {
		return professoresService.atualizarProfessor(professor);
	}
	
	@DeleteMapping
	public Long deletarProfessor(@RequestBody Professores professor) {
		return professoresService.deletarProfessor(professor);
	}
}
