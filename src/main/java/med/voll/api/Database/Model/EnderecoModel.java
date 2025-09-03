package med.voll.api.Database.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Embeddable
@Table( name = "tb_enderecos" )
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoModel
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String UF;
    private String CEP;
}
