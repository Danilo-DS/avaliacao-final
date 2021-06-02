package br.com.acmecpm.msempresa.resource;

import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.acmecpm.msempresa.model.Empresa;


@RequestMapping(value = "/api/v1/empresa")
@SuppressWarnings("static-access")
public class EmpresaResource {
	
	@GetMapping
	public ResponseEntity<?> listaEmpresa() {
		var empresa1 = new Empresa().builder().id(1L).razaoSocial("Empresa 1").cnpj("88899977559-82");		
		var empresa2 = new Empresa().builder().id(2L).razaoSocial("Empresa 2").cnpj("11566687999-53");

		return ResponseEntity.ok(Arrays.asList(empresa1.build(), empresa2.build()));
	}
}
