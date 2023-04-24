package me.dio.academia.digital.entity.form;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

	@Positive
  private Long alunoId;

	@NotNull(message = "Valor nao pode ser nulo")
	@Positive(message = "${validatedValue} precisa ser um valor positivo!")
  private double peso;

	@NotNull(message = "Valor nao pode ser nulo")
	@Positive(message = "${validatedValue}' precisa ser positivo.")
	@DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}.")
  private double altura;
}
