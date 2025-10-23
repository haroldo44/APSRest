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

import ifpb.aps.ws.model.Curso;
import ifpb.aps.ws.service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {

	@Autowired
	private CursoService cursoService;
	
	@GetMapping
	public List<Curso> listarCurso() {
		return cursoService.listarCurso();
	}
	
	@PostMapping
	public Curso cadastrarCurso(@RequestBody Curso curso) {
		return cursoService.cadastrarCurso(curso);
	}
	
	@PutMapping
	public Curso atualizarCurso(@RequestBody Curso curso) {
		return cursoService.atualizarCurso(curso);
	}
	
	@DeleteMapping
	public Long deletarCurso(@RequestBody Curso curso) {
		return cursoService.deletarCurso(curso);
	}
}
