/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_karimguifarro_cesarbrito;

import java.util.*;
/**
 *
 * @author Karim Ozael
 */
public class Equipo {
    private String nombreEquipo;
    private String estadio;
    private String Pais;
    private String nombreEntrenador;
    private String nombreDueño;
    private String nombreMascota;
    private String Color;
    private Date fecha;
    private ArrayList<Jugador> jugadores = new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombreEquipo, String estadio, String Pais, String nombreEntrenador, String nombreDueño, String nombreMascota, String Color, Date fecha) {
        this.nombreEquipo = nombreEquipo;
        this.estadio = estadio;
        this.Pais = Pais;
        this.nombreEntrenador = nombreEntrenador;
        this.nombreDueño = nombreDueño;
        this.nombreMascota = nombreMascota;
        this.Color = Color;
        this.fecha = fecha;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", estadio=" + estadio + ", Pais=" + Pais + ", nombreEntrenador=" + nombreEntrenador + ", nombreDue\u00f1o=" + nombreDueño + ", nombreMascota=" + nombreMascota + ", Color=" + Color + ", fecha=" + fecha + ", jugadores=" + jugadores;
    }

}
