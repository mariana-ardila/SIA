package com.Proyecto_Integrador_SIA.Us.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Proyecto_Integrador_SIA.Us.Models.us;
import com.Proyecto_Integrador_SIA.Us.UseCase.usUseCase;

@RestController
@RequestMapping("/nosotros")
public class usController {
    private us informacion;
    private usUseCase useCase = new usUseCase();

    public usController(){
        informacion = new us("CESDE - Centro de estudios de sistema y desarrollo empresarial",
                "Formar técnicos laborales competentes en tecnología, con sentido ético y social.",
                "Ser una institución líder en educación técnica en Colombia.",
                "El CESDE nació con el propósito de ofrecer formación técnica de calidad en el área de sistemas y desarrollo empresarial.");
    }

    @GetMapping("/informacion")
    public String VerInformacion(){
        return useCase.VerInformación(informacion);
    }
}
