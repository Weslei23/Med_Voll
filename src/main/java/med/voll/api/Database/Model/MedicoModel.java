package med.voll.api.Database.Model;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.Dto.MedicoDTO;

@Entity
@Table( name = "tb_medicos" )
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode( of = "id" )
public class MedicoModel
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;

    @Enumerated( EnumType.STRING )
    private Especialidade especialidade;

    @Embedded
    private EnderecoModel endereco;

    public MedicoModel( MedicoDTO medicoDTO )
    {
        this.nome = medicoDTO.nome();
        this.email = medicoDTO.email();
        this.telefone = medicoDTO.telefone();
        this.crm = medicoDTO.crm();
        this.endereco = new EnderecoModel( medicoDTO.enderecoDTO() );
        this.especialidade = medicoDTO.especialidade();
    }
}
