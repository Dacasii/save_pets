package com.save_pets.mvc.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="regions")
public class Regions {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String name;
	
	@OneToMany(mappedBy="region")
    private Set<Communes> communes;

	
	public Regions() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Communes> getCommunes() {
		return communes;
	}

	public void setCommunes(Set<Communes> communes) {
		this.communes = communes;
	}
	
	
	
	
}
