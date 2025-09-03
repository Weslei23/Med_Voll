package med.voll.api.Database.Repository;

import med.voll.api.Database.Model.MedicoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<MedicoModel, Long>
{
}
