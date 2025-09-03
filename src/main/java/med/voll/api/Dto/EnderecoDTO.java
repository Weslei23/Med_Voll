package med.voll.api.Dto;

public record EnderecoDTO(
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String UF,
        String CEP )
{
}
