package br.com.acmecpm.msempresa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empresa {
	
	private Long id;
	private String razaoSocial;
	private String cnpj;
}
