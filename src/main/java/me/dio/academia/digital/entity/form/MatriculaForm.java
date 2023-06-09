package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {

	@NotNull(message = "Preencha o campo corretamente!")
	@Positive(message = "${validatedValue} deve ser um valor positivo!")
  private Long alunoId;

}
