package br.com.secretariat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import br.com.secretariat.enums.EnumFolder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Data
@Table(name = "secretariat")
public class Secretariat {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	@Column(name = "folder", unique = true)
	private EnumFolder folder;
	
	@NotNull
	@NotBlank
	private String secretary;
	
	@NotNull
	private int populationGrade;
	
	@NotNull
	private boolean underInvestigation = false;
	
}
