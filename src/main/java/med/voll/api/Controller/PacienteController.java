package med.voll.api.Controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.Database.Model.PacienteModel;
import med.voll.api.Database.Repository.PacienteRepository;
import med.voll.api.Dto.PacienteDTO;
import med.voll.api.Dto.PacienteRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "pacientes" )
public class PacienteController
{
    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping
    public Page<PacienteRequestDTO> listar( @PageableDefault( size = 10, sort = { "nome" } ) Pageable pageable )
    {
        return pacienteRepository.findAll( pageable ).map( PacienteRequestDTO::new );
    }

    @PostMapping
    @Transactional
    public void cadastrar( @RequestBody @Valid PacienteDTO pacienteDTO )
    {
        pacienteRepository.save( new PacienteModel( pacienteDTO ) );
    }
}
