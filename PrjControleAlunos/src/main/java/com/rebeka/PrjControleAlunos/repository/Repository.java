package com.rebeka.PrjControleAlunos.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Entitiesjpa.entities.Entities;
import com.rebeka.PrjControleAlunos.entities.Entities.Aluno;
public interface Repository extends JpaRepository<Aluno, Long> {
	
}
