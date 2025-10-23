package ifpb.aps.ws.model;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Professores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="professor_seq")
	@SequenceGenerator(name="professor_seq", sequenceName="professor_seq",allocationSize=1)
	private Long matricula;
	
	@Column
	private String nome;
	
	@Column
	private String area;
	
	@ManyToMany(mappedBy = "professores")
	@JsonIgnore
	private List<Aluno> alunos;
	
	@Embedded
	private Endereco endereco;
	
	
	
	@Column
	public Long getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professores other = (Professores) obj;
		return Objects.equals(matricula, other.matricula);
	}
}
