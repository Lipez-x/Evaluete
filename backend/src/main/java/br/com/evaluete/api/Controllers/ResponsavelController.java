package br.com.evaluete.api.Controllers;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.evaluete.api.Dtos.ResponsavelDto;
import br.com.evaluete.api.Models.ResponsavelModel;
import br.com.evaluete.api.Services.ResponsavelService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/responsavel")
public class ResponsavelController {

    
    final ResponsavelService responsavelService;

    public ResponsavelController(ResponsavelService responsavelService) {
        this.responsavelService = responsavelService;
    } 

    @PostMapping
    public ResponseEntity<Object> saveResponsavel(@RequestBody @Valid ResponsavelDto responsavelDto){
        ResponsavelModel responsavelModel = new ResponsavelModel();
        BeanUtils.copyProperties(responsavelDto, responsavelModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(responsavelService.save(responsavelDto));

    }
}
