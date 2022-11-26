package br.com.evaluete.api.Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.evaluete.api.Models.ResponsavelModel;

@Repository
public interface ResponsavelRepository extends JpaRepository<ResponsavelModel, UUID>{
    
}