package br.com.evaluete.api.Services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.evaluete.api.Dtos.ResponsavelDto;
import br.com.evaluete.api.Models.ResponsavelModel;
import br.com.evaluete.api.Repositories.ResponsavelRepository;

@Service
public class ResponsavelService {

    @Autowired
    ResponsavelRepository responsavelRepository;

    @Transactional
    public ResponsavelModel save(@Valid ResponsavelDto responsavelDto) {
        return responsavelRepository.save(responsavelDto);
    }
    
}