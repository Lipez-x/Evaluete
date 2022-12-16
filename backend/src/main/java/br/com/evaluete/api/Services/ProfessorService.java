package br.com.evaluete.api.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.evaluete.api.Models.ProfessorModel;
import br.com.evaluete.api.Repositories.ProfessorRepository;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    @Transactional
    public Object save(ProfessorModel professorModel) {
        return professorRepository.save(professorModel);
    }
    
}