package br.com.evaluete.api.Services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.evaluete.api.Models.AlunoModel;
import br.com.evaluete.api.Repositories.AlunoRepository;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    @Transactional
    public AlunoModel save(AlunoModel alunoModel) {
        return alunoRepository.save(alunoModel);
    }
    
}
