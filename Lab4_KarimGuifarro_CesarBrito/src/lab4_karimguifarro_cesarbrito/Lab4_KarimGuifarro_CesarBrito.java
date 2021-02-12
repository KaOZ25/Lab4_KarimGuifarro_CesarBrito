/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_karimguifarro_cesarbrito;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Lab4_KarimGuifarro_CesarBrito {

    public static Scanner KaOz = new Scanner(System.in);
    public static ArrayList<Equipo> equipos = new ArrayList();
    public static SimpleDateFormat osd = new SimpleDateFormat("dd/MM/yyy");
    public static ArrayList<Jugador> jugador  = new ArrayList();
    public static void main(String[] args) throws ParseException {
        char k = 'c';
        while (k == 'c') {
            System.out.print("*****Menu*****\n"
                    + "1) Equipos\n"
                    + "2) Jugadores\n"
                    + "3) Juego!\n"
                    + "4)Salida\n");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Equipos\n"
                            + "1)Agregar\n"
                            + "2)Modificar\n"
                            + "3)Listar\n"
                            + "4)Eliminar\n"
                            + "5)Salir");
                    int po = KaOz.nextInt();
                    switch (po) {

                        case 1: {
                            String nombreEquipo, estadio, Pais, nombreEntrenador, nombreDueño, nombreMascota, color, fech;
                            Date fecha;
                            System.out.println("Ingrese el nombre del Equipo:");
                            nombreEquipo = KaOz.next();
                            System.out.println("Ingrese el nombre del estadio:");
                            estadio = KaOz.next();
                            System.out.println("Ingrese el pais de origen:");
                            Pais = KaOz.next();
                            System.out.println("Ingrese el nombre del entrenador:");
                            nombreEntrenador = KaOz.next();
                            System.out.println("Ingrese el nombre del dueño:");
                            nombreDueño = KaOz.next();
                            System.out.println("Ingrese el nombre de la mascota:");
                            nombreMascota = KaOz.next();
                            System.out.println("Ingrese el color del equipo:");
                            color = KaOz.next();
                            System.out.println("Ingrese la fecha de creacion:");
                            fech = KaOz.next();
                            fecha = osd.parse(fech);
                            equipos.add(new Equipo(nombreEquipo, estadio, Pais, nombreEntrenador, nombreDueño, nombreMascota, color, fecha));
                        }
                        break;
                        case 2: {

                        }
                        break;
                        case 3: {
                            Print(equipos);
                            System.out.print("Ingrese la posicion del equipo que desea eliminar: ");
                            int p = KaOz.nextInt();
                            if (p <= equipos.size()) {
                                equipos.remove(p);
                            }
                        }
                        case 4:{
                            
                        }
                        case 5:{
                            break;
                        }
                        default:
                            System.out.println("Ingrese un valor correcto");
                    }
                }
                break;
                case 2:{
                     System.out.println("Jugadores\n"
                            + "1)Agregar\n"
                            + "2)Modificar\n"
                            + "3)Listar\n"
                            + "4)Eliminar\n"
                            + "5)Salir");
                    int po = KaOz.nextInt();
                    switch (po) {
                        case 1:{
                            String nombre,apodo,equipoFutFavorito,equipoBaskFavorito,jugadorFavorito;
                            int numeroCamiseta,nacimiento,estrellas,edad;
                            boolean mayor=false;
                            System.out.println("ingrese el nombre del jugador:");
                            nombre=KaOz.next();
                            System.out.println("Ingrese el apodo:");
                            apodo=KaOz.next();
                            System.out.println("Ingrese el equipo de futbol favorito:");
                            equipoFutFavorito=KaOz.next();
                            System.out.println("Ingrese el equipo de Basketball favorito:");
                            equipoBaskFavorito=KaOz.next();
                            System.out.println("Ingrese su jugador favorito:");
                            jugadorFavorito=KaOz.next();
                            System.out.println("Ingrese el numero de su camisa:");
                            numeroCamiseta=KaOz.nextInt();
                            System.out.println("Ingrese su fecha de nacimiento");
                            nacimiento=KaOz.nextInt();
                            System.out.println("Ingrese la cantidad de estrellas:");
                            estrellas=KaOz.nextInt();
                            while(estrellas<=1 || estrellas>=5 ){
                                System.out.println("Ingrese un valor permitido");
                                estrellas=KaOz.nextInt();
                            }
                            System.out.println("Ingrese la edad:");
                            edad=KaOz.nextInt();
                            if (edad>=21) {
                                mayor=true;
                            }
                            jugador.add(new Jugador( nombre,apodo,equipoFutFavorito,equipoBaskFavorito,jugadorFavorito,numeroCamiseta,nacimiento,estrellas,mayor));
                        }
                        case 2:{
                            
                        }
                        case 3:{
                            
                        }
                        case 4:{
                            
                        }
                               
                    }
                }
                break;
                case 3:{
                    
                }
            }

        }
    }

    static void Print(ArrayList equipos) {
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println("[" + equipos.get(i) + "]");
        }
    }
}
