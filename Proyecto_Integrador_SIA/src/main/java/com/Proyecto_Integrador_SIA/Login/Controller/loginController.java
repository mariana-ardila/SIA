package com.Proyecto_Integrador_SIA.Login.Controller;

import com.Proyecto_Integrador_SIA.Login.UseCase.loginUseCase;

public class loginController {
    public loginUseCase UseCase;
    
    public loginController(){
        this.UseCase = new loginUseCase(); //inicializacion de la lista de usuarios

    }

    public boolean sigIn(String email, String password){ 
        return this.UseCase.sigIn(email, password); 
    }
}
