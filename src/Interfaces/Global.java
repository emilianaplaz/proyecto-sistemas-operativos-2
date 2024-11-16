/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import EDD.Lista;
import Clases.Studio;

/**
 * @author Emiliana Plaz
 * @author Stefano Boschetti
 */
public class Global {

    private static String[] starWars = {"bb8", "c3po", "chewbaca", "darthmaul", "darthvader", "dooku", "finn", "hansolo", "jarjar",
    "kylorean", "leia", "luke", "obiwan", "padme", "palpatine", "poe", "r2d2", "rey", "stormtrooper", "yoda"}; // Personajes de Star Wars
    
    private static String[] starTrek = {"barclay", "burnham", "data", "dax", "garak", "janeway", "neelix", "nerys", "picard", "riker",
    "scooty", "seven-of-nine", "sisko", "tucker", "tuvok", "uhura", "worf", "mccoy", "spok", "kirk"}; // Personajes de StarTrek

    private static String[] objetos = {"Lightsaber", "Pistola", "La Fuerza", "Blaster", "Phaser", "Espada Bat´telh", "Lirpa", "Puñal D´kTahg", "Látigo láser", "Disruptor romulano"}; 

    private static Studio studioStarWars;
    private static Studio studioStarTrek;

    private static Lista ganadores = new Lista(); //lista de ganadores
    
    public static String[] getStarWars() {
        return starWars;
    }

    public static void setStarWars(String[] aStarWars) {
        starWars = aStarWars;
    }

    public static String[] getStarTrek() {
        return starTrek;
    }

    public static void setStarTrek(String[] aStarTrek) {
        starTrek = aStarTrek;
    }

    public static String[] getObjetos() {
        return objetos;
    }

    public static void setObjetos(String[] aObjetos) {
        objetos = aObjetos;
    }

    public static Studio getStudioStarWars() {
        return studioStarWars;
    }

    public static void setStudioStarWars(Studio aStudioStarWars) {
        studioStarWars = aStudioStarWars;
    }

    public static Studio getStudioStarTrek() {
        return studioStarTrek;
    }

    public static void setStudioStarTrek(Studio aStudioStarTrek) {
        studioStarTrek = aStudioStarTrek;
    }

    public static Lista getGanadores() {
        return ganadores;
    }

    public static void setGanadores(Lista aGanadores) {
        ganadores = aGanadores;
    }

}
