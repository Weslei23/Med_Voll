package med.voll.api.Controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.Database.Model.MedicoModel;
import med.voll.api.Database.Repository.MedicoRepository;
import med.voll.api.Dto.MedicoDTO;
import med.voll.api.Dto.MedicoRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "medicos" )
public class MedicoController
{
    @Autowired
    private MedicoRepository medicoRepository;

    @GetMapping
    public Page<MedicoRequestDTO> listar( @PageableDefault( size = 10, sort = { "nome" } ) Pageable pageable )
    {
        return medicoRepository.findAll(pageable).map( MedicoRequestDTO::new );
    }

    @PostMapping
    @Transactional
    public void cadastrar( @RequestBody @Valid MedicoDTO medicoDTO)
    {
        medicoRepository.save( new MedicoModel( medicoDTO ) );
    }
}
