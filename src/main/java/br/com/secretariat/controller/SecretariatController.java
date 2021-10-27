package br.com.secretariat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.secretariat.model.Secretariat;
import br.com.secretariat.service.SecretariatService;

@RestController
@RequestMapping("secretariats")
public class SecretariatController {

	private SecretariatService secretariatService;
	
	@Autowired
	public SecretariatController(SecretariatService secretariatService) {
		this.secretariatService = secretariatService;
	}
	
	@PostMapping
	public ResponseEntity<Secretariat> save(@RequestBody Secretariat secretariat){
		return ResponseEntity.ok(secretariatService.save(secretariat));
	}
	
	@GetMapping
	public ResponseEntity<List<Secretariat>> findAll() {
		return ResponseEntity.ok(secretariatService.findAll());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Secretariat> findById(@PathVariable Long id) {
		return ResponseEntity.ok(secretariatService.findById(id));
	}
}
