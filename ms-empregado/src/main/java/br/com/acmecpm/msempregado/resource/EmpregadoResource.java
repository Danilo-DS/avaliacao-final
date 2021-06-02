package br.com.acmecpm.msempregado.resource;

import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acmecpm.msempregado.domain.Empregado;

@RestController
@RequestMapping(value = "/api/empregado")
@SuppressWarnings("static-access")
public class EmpregadoResource {
	
	@GetMapping
	public ResponseEntity<?> listaEmpregado() {
		var empregado1 = new Empregado().builder().id(1L).nome("Danilo").email("danilo@gmail.com");		
		var empregado2 = new Empregado().builder().id(2L).nome("Usuario 2").email("usuario2@gmail.com");

		return ResponseEntity.ok(Arrays.asList(empregado1.build(), empregado2.build()));
	}
}
