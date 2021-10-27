package br.com.secretariat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.secretariat.model.Secretariat;

public interface SecretariatRepository extends JpaRepository<Secretariat, Long>{

}
