package med.voll.api.Database.Model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import med.voll.api.Dto.EnderecoDTO;

@Embeddable
@Table( name = "tb_enderecos" )
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoModel
{
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String UF;
    private String CEP;

    public EnderecoModel( EnderecoDTO enderecoDTO )
    {
        this.logradouro = enderecoDTO.logradouro();
        this.numero = enderecoDTO.numero();
        this.complemento = enderecoDTO.complemento();
        this.bairro = enderecoDTO.bairro();
        this.cidade = enderecoDTO.cidade();
        this.UF = enderecoDTO.UF();
        this.CEP = enderecoDTO.CEP();
    }
}
