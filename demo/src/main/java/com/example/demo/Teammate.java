package com.example.demo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Teammate {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String skill;

	public Teammate() {

	}

	public Teammate(String name, String skill) {
		this.name = name;
		this.skill = skill;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, skill);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teammate other = (Teammate) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(skill, other.skill);
	}

	@Override
	public String toString() {
		return "Teammate [id=" + id + ", name=" + name + ", skill=" + skill + "]";
	}

}
