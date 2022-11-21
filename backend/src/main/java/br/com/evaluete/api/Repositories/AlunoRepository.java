package br.com.evaluete.api.Repositories;

import javax.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.evaluete.api.Models.AlunoModel;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, Id>{
    
}
