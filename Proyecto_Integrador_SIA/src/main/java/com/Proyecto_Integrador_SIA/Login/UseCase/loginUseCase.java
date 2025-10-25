package com.Proyecto_Integrador_SIA.Login.UseCase;

import java.util.ArrayList;
import java.util.List;

import com.Proyecto_Integrador_SIA.Login.Models.login;

public class loginUseCase {
    public List<login> users; //declaracion de una lista de usuarios
    //Constructor
    public loginUseCase(){
        this.users = new ArrayList<login>(); //inicializacion de la lista de usuarios
    }

    public boolean sigIn(String email, String password){
        login user = new login(email, password);
        
        for(login u : users){
            if(u.getEmail().equals(email) && u.getPassword().equals(password)){
                return true;
            }
        }  
        
        return false;
        
    }
}
