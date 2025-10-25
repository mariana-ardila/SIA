package com.Proyecto_Integrador_SIA.Login.Models;

public class login {
    public String name;
    public String email;
    public String password;

    //Constructor
    public login(){}


    public login(String email, String password){
        this.email = email;
        this.password = password;
    }

    public login(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    //Metodos getters y setters
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
