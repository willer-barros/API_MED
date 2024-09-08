package med.vol.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import med.vol.api.medico.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired     //indica ao spring que ele instanciara
    private MedicoRepository repository;

    @PostMapping
    @Transactional    // tem de importar o do spring
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        repository.save(new Medico(dados));
    }
    
}
