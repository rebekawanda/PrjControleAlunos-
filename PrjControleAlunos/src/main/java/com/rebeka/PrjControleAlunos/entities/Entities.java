package com.rebeka.PrjControleAlunos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Entities {

	@Entity
	@Table(name = "Aluno")
	public class Aluno {
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "nome")
		private String name;
		
		@Column(name = "preco")
		private double price;
		
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
			this.name= name;
		}
		public double getPrice() {
			return price;
		}
		public void setId(double id) {
			this.price = price;
		}
		
	}
}
