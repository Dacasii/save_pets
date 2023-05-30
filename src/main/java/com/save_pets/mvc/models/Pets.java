package com.save_pets.mvc.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="pets")
public class Pets {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String name;
	
	@Column
	private String color;
	
	@Column
	private String weight;
	
	@Column
	private String race;
	
	@ManyToOne
    @JoinColumn(name="foundation_id", nullable=false)
    private Foundations foundation;
	
	@OneToMany(mappedBy="pet")
    private Set<Requests> requests;
	
	public Pets() {}

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Foundations getFoundation() {
		return foundation;
	}

	public void setFoundation(Foundations foundation) {
		this.foundation = foundation;
	}

	public Set<Requests> getRequests() {
		return requests;
	}

	public void setRequests(Set<Requests> requests) {
		this.requests = requests;
	}
	
	
	
}
