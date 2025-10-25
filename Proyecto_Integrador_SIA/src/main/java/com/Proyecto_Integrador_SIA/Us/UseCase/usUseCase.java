package com.Proyecto_Integrador_SIA.Us.UseCase;

import com.Proyecto_Integrador_SIA.Us.Models.us;

public class usUseCase {
    public String VerInformación(us informacion){
        return "Nombre:" + informacion.getNombreSistema() + "Vision:" + informacion.getVision() + "Mision: " + informacion.getMision() + "Historia: " + informacion.getDescripcionSistema();
    }
}
