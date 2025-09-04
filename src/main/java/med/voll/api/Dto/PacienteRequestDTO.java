package med.voll.api.Dto;

import med.voll.api.Database.Model.PacienteModel;

public record PacienteRequestDTO(

    String nome,
    String email,
    String CPF
)
{
    public PacienteRequestDTO( PacienteModel pacienteModel )
    {
        this( pacienteModel.getNome(), pacienteModel.getEmail(), pacienteModel.getCPF() );
    }
}
