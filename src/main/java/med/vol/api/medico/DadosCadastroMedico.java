package med.vol.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.vol.api.endereco.DadosEndereco;

//usamos o bean validation
//@notblank ja faz a validacao se o campo eh null

public record DadosCadastroMedico(

@NotBlank
String nome,

@NotBlank
@Email
String email, 

@NotBlank
@Pattern(regexp = "\\d{4,6}")
String crm, 

@NotNull
Especialidade especialidade, 


@NotNull
@Valid 
DadosEndereco endereco
) {

}
