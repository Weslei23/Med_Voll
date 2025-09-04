package med.voll.api.Database.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import med.voll.api.Dto.PacienteDTO;

@Entity
@Table( name = "tb_pacientes" )
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PacienteModel
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String CPF;

    @Embedded
    EnderecoModel endereco;

    public PacienteModel( PacienteDTO pacienteDTO )
    {
        this.nome = pacienteDTO.nome();
        this.email = pacienteDTO.email();
        this.telefone = pacienteDTO.telefone();
        this.CPF = pacienteDTO.CPF();
        this.endereco = new EnderecoModel( pacienteDTO.enderecoDTO() );
    }
}
