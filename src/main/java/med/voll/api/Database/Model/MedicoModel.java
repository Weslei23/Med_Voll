package med.voll.api.Database.Model;

import jakarta.persistence.*;
import lombok.*;

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
}
