/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_karimguifarro_cesarbrito;

/**
 *
 * @author Karim Ozael
 */
public class Jugador {
    private String nombre,apodos,equipofav,jugadorfav;
    private int numcamisa,nacimiento,estrellas;
    private boolean mayor;

    public Jugador() {
    }

    public Jugador(String nombre, String apodos, String equipofav, String jugadorfav, int numcamisa, int nacimiento, int estrellas, boolean mayor) {
        this.nombre = nombre;
        this.apodos = apodos;
        this.equipofav = equipofav;
        this.jugadorfav = jugadorfav;
        this.numcamisa = numcamisa;
        this.nacimiento = nacimiento;
        this.estrellas = estrellas;
        this.mayor = mayor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodos() {
        return apodos;
    }

    public void setApodos(String apodos) {
        this.apodos = apodos;
    }

    public String getEquipofav() {
        return equipofav;
    }

    public void setEquipofav(String equipofav) {
        this.equipofav = equipofav;
    }

    public String getJugadorfav() {
        return jugadorfav;
    }

    public void setJugadorfav(String jugadorfav) {
        this.jugadorfav = jugadorfav;
    }

    public int getNumcamisa() {
        return numcamisa;
    }

    public void setNumcamisa(int numcamisa) {
        this.numcamisa = numcamisa;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public boolean isMayor() {
        return mayor;
    }

    public void setMayor(boolean mayor) {
        this.mayor = mayor;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apodos=" + apodos + ", equipofav=" + equipofav + ", jugadorfav=" + jugadorfav + ", numcamisa=" + numcamisa + ", nacimiento=" + nacimiento + ", estrellas=" + estrellas + ", mayor=" + mayor + '}';
    }
    
}
