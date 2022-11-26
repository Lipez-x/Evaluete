package br.com.evaluete.api.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.evaluete.api.Repositories.ProfessorRepository;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;
    
}