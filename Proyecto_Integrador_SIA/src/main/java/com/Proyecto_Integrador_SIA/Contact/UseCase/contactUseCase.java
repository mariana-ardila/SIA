package com.Proyecto_Integrador_SIA.Contact.UseCase;

import java.util.List;

import com.Proyecto_Integrador_SIA.Contact.Models.contact;

public class contactUseCase {
    public String enviarMensaje(List<contact> mensajes, contact nuevoMensaje){
        mensajes.add(nuevoMensaje);
        return "Mensaje enviado correctamente por: " + nuevoMensaje.getNombre();
    }

    public List<contact> MensajesRecibidos(List<contact> mensajes){
        return mensajes;
    }
}

