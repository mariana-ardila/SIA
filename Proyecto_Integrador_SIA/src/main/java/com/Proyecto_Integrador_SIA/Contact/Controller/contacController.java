package com.Proyecto_Integrador_SIA.Contact.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Proyecto_Integrador_SIA.Contact.Models.contact;
import com.Proyecto_Integrador_SIA.Contact.UseCase.contactUseCase;

public class contacController {
    private contactUseCase useCase = new contactUseCase();
    private List<contact> listaMensajes = new ArrayList<>();

    @PostMapping("/mensajes")
    public String enviarMensaje(@RequestBody contact nuevoMensaje){
        listaMensajes.add(nuevoMensaje);
        return "Mensaje enviado correctamente de " + nuevoMensaje.getNombre() + " " + nuevoMensaje.getCorreo();
    }

    @GetMapping("/mensajes")
    public List<contact> verMensajes(){
        return useCase.MensajesRecibidos(listaMensajes);
    }
}
