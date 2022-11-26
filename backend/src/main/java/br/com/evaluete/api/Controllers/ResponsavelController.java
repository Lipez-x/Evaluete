package br.com.evaluete.api.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.evaluete.api.Services.ResponsavelService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/responsavel")
public class ResponsavelController {

    @Autowired
    ResponsavelService responsavelService; 

}
