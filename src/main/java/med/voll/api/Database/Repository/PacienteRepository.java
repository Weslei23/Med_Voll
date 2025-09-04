package med.voll.api.Database.Repository;

import med.voll.api.Database.Model.PacienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<PacienteModel, Long>
{
}
