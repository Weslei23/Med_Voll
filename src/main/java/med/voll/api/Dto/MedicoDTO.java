package med.voll.api.Dto;

import med.voll.api.Database.Model.Especialidade;

public record MedicoDTO(
        String nome,
        String email,
        String telefone,
        String crm,
        Especialidade especialidade,
        EnderecoDTO enderecoModel )
{
}
