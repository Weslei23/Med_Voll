package med.voll.api.Dto;

import med.voll.api.Database.Model.Especialidade;
import med.voll.api.Database.Model.MedicoModel;

public record MedicoRequestDTO(

        String nome,
        String email,
        String crm,
        Especialidade especialidade
)
{
    public MedicoRequestDTO( MedicoModel medicoModel )
    {
        this( medicoModel.getNome(), medicoModel.getEmail(), medicoModel.getCrm(), medicoModel.getEspecialidade() );
    }
}
