package br.com.secretariat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.secretariat.model.Secretariat;
import br.com.secretariat.repository.SecretariatRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SecretariatService {

	private SecretariatRepository secretariatRepository;
	
	public Secretariat save(Secretariat secretariat) {
		return secretariatRepository.save(secretariat);
	}
	
	public List<Secretariat> findAll() {
		return secretariatRepository.findAll();
	}
	
	public Secretariat findById(Long id) {
		return secretariatRepository.findById(id).get();
	}
}
