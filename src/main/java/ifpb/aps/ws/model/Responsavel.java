package ifpb.aps.ws.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Responsavel")
public class Responsavel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="responsavel_seq")
    @SequenceGenerator(name="responsavel_seq", sequenceName="responsavel_seq", allocationSize=1)
    @Column(name = "id_resp")  // Certifique-se que o nome da coluna no banco é "id_resp"
    private int idResp;

    @Column
    private String nome;

    @Column
    private String telefone;

    // Getters e setters
    public int getIdResp() {
        return idResp;
    }

    public void setIdResp(int idResp) {
        this.idResp = idResp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
