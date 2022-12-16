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

import br.com.evaluete.api.Dtos.ProfessorDto;
import br.com.evaluete.api.Models.ProfessorModel;
import br.com.evaluete.api.Services.ProfessorService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/professor")
public class ProfessorController {
    
    
    final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @PostMapping
    public ResponseEntity<Object> saveProfessor(@RequestBody @Valid ProfessorDto professorDto){
        ProfessorModel professorModel = new ProfessorModel();
        BeanUtils.copyProperties(professorDto, professorModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(professorService.save(professorModel));

    }
}
