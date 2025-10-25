package com.Proyecto_Integrador_SIA.Us.Models;

public class us {
    private String nombreSistema;
    private String mision;
    private String vision;
    private String descripcionSistema;

    //Constructor
    public us(String nombreSistema, String mision, String vision, String descripcionSistema){
        this.nombreSistema = nombreSistema;
        this.mision = mision;
        this.vision = vision;
        this.descripcionSistema = descripcionSistema;
    }

    //Setters
    public void setNombreSistema(String nombreSistema){
        this.nombreSistema = nombreSistema;
    }

    public void setMision(String mision){
        this.mision = mision;
    }

    public void setVision(String vision){
        this.vision = vision;
    }

    public void setDescripcionSistema(String descripcionSistema){
        this.descripcionSistema = descripcionSistema;
    }

    //Getters
    public String getNombreSistema(){
        return nombreSistema;
    }

    public String getMision(){
        return mision;
    }

    public String getVision(){
        return vision;
    }

    public String getDescripcionSistema(){
        return descripcionSistema;
    }

    @Override 
    public String toString(){
        return "Institución:" + nombreSistema + "Misión: " + mision + "Visión: " + vision + "Historia: " + descripcionSistema;
    }
}
