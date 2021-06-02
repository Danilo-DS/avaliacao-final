package br.com.acmecpm.mscliente.resource;

import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.acmecpm.mscliente.domain.Cliente;

@RequestMapping(value = "/api/v1/cliente")
@SuppressWarnings("static-access")
public class ClienteResource {
	
	@GetMapping
	public ResponseEntity<?> listaEmpregado() {
		var cliente1 = new Cliente().builder().id(1L).nome("Carlito").cpf("566884626");		
		var cleinte2 = new Cliente().builder().id(2L).nome("Marin").cpf("15689961886");

		return ResponseEntity.ok(Arrays.asList(cliente1.build(), cleinte2.build()));
	}
}
