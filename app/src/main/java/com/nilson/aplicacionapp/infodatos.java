package com.nilson.aplicacionapp;

public class infodatos {

    String nombre, apellido,correo,ratin,entel,claro,movistar,selecspin;
    String genero;

    public infodatos(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public infodatos(String nombre, String apellido, String correo, String ratin, String entel, String claro, String movistar, String selecspin) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;

        this.ratin = ratin;
        this.entel = entel;
        this.claro = claro;
        this.movistar = movistar;
        this.selecspin = selecspin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }



    public String getRatin() {
        return ratin;
    }

    public void setRatin(String ratin) {
        this.ratin = ratin;
    }

    public String getEntel() {
        return entel;
    }

    public void setEntel(String entel) {
        this.entel = entel;
    }

    public String getClaro() {
        return claro;
    }

    public void setClaro(String claro) {
        this.claro = claro;
    }

    public String getMovistar() {
        return movistar;
    }

    public void setMovistar(String movistar) {
        this.movistar = movistar;
    }

    public String getSelecspin() {
        return selecspin;
    }

    public void setSelecspin(String selecspin) {
        this.selecspin = selecspin;
    }
}
