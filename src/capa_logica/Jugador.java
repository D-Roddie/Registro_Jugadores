/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_logica;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Jugador {

    private String nombre;
    private String apellido;
    private String username;
    private String rol;

    public Jugador(String nombre, String apellido, String username, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.rol = rol;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", username=" + username + ", rol=" + rol + '}';
    }

}
