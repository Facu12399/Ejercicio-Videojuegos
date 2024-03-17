package org.EjercicioVideoJuegos;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        
    	//Creamos el ArrayList
    	List<Videojuegos> listaVideojuegos = new ArrayList<Videojuegos>();
    	
    	//Creamos objetos y introducimos datos
    	Videojuegos game1 = new Videojuegos(150,"FC 24","Play Station 5",2,"Deportes");
    	Videojuegos game2 = new Videojuegos(151,"The Sims 4","PC",1,"Aventura");
    	Videojuegos game3 = new Videojuegos(152,"Age of Empires II","PC",1,"Estrategia");
    	Videojuegos game4 = new Videojuegos(153,"GTA VI","Xbox",1,"Accion-Aventura");
    	Videojuegos game5 = new Videojuegos(154,"Mario Bros","Nintendo 64",1,"Aventura");
    	
    	//Agregamos a la lista
    	listaVideojuegos.add(game1);
    	listaVideojuegos.add(game2);
    	listaVideojuegos.add(game3);
    	listaVideojuegos.add(game4);
    	listaVideojuegos.add(game5);
    	
    	//Recorremos la lista
    	for(Videojuegos juego : listaVideojuegos) {
    		System.out.println(juego.toString());
    	}
    	
    	System.out.println();
    	System.out.println("------------------------------------------------------");
    	System.out.println();
    	
    	//Cambiamos nombre y cantidad de jugadores de dos juegos
    	game2.setTitulo("Farcry");
    	game2.setCantidadJugadores(2);
    	
    	game4.setTitulo("Medal of Honor");
    	game4.setCantidadJugadores(2);
    	
    	//Recorremos la lista
    	for(Videojuegos juego : listaVideojuegos) {
    		System.out.println(juego.toString());
    	}
    	
    	System.out.println();
    	System.out.println("------------------------------------------------------");
    	System.out.println();
    	
    	//Buscamos el juego que tenga la consola Nintendo 64
    	String busqueda = "Nintendo 64";
    	
    	for(Videojuegos juego: listaVideojuegos) {
    		if(juego.getConsola().equals(busqueda)) {
    			System.out.println(juego.toString());
    		}
    	}
    	
    	
    }
}
