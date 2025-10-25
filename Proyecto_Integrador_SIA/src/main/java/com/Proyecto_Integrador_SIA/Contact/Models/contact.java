package com.Proyecto_Integrador_SIA.Contact.Models;

public class contact {
    private String nombre;
    private String correo;
    private String asunto;
    private String mensaje;

    public contact(String nombre, String correo, String asunto, String mensaje) {
        this.nombre = nombre;
        this.correo = correo;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setAsunto(String asunto){
        this.asunto = asunto;
    }

    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }

    //Getters

    public String getNombre(){
        return nombre;
    }

    public String getCorreo(){
        return correo;
    }

    public String getAsunto(){
        return asunto;
    }

    public String getMensaje(){
        return mensaje;
    }

    @Override
    public String toString(){
        return "MensajeContacto{" + "nombre =" + nombre + "correo =" + correo + "asunto =" + asunto + "mensaje =" + mensaje + "}";
    }
}
