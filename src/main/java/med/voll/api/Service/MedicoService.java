package med.voll.api.Service;

import med.voll.api.Database.Model.MedicoModel;
import med.voll.api.Database.Repository.MedicoRepository;
import med.voll.api.Dto.MedicoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService
{
    @Autowired
    private MedicoRepository medicoRepository;

    public MedicoDTO getMedicoById( Long id )
    {

    }

    public MedicoDTO criarMedico( MedicoDTO medicoDTO )
    {
        MedicoModel medicoModel = medicoRepository.save( medicoDTO );

        return MedicoDTO.f
    }
}
