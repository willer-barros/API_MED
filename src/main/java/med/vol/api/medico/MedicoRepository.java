package med.vol.api.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MedicoRepository extends JpaRepository<Medico, Long> {

    Page<Medico> findAllByAtivoTrue(org.springframework.data.domain.Pageable paginacao);
}
