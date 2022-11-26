package br.com.evaluete.api.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.evaluete.api.Repositories.ResponsavelRepository;

@Service
public class ResponsavelService {

    @Autowired
    ResponsavelRepository alunoRepository;
    
}