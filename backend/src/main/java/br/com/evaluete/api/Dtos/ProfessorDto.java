package br.com.evaluete.api.Dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class ProfessorDto {

    @NotBlank
    private String login;
    @NotBlank @Email
    private String email;
    @NotBlank
    private String nome;
    @NotBlank @Size(min = 11, max = 11)
    private String cpf;
    @NotBlank @Size(max = 11)
    private String telefone;
}
