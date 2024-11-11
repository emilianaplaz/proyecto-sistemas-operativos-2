/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Cola;

/**
 *
 * @author emilianaplaz
 */
public class Studio {

    private String name;
    private Cola prioridad1;
    private Cola prioridad2;
    private Cola prioridad3;
    private Cola refuerzo;
    private int ganados = 0;

    public Studio(String name) {
        this.name = name;
        this.prioridad1 = new Cola();
        this.prioridad2 = new Cola();
        this.prioridad3 = new Cola();
        this.refuerzo = new Cola();
    }

    public void CreateCharacter(String name, String Object, int id) {
        Character personaje = new Character(name, Object, id);
        personaje.CalcularStats();
        switch (personaje.getNivel()) {
            case 1 -> prioridad1.encolar(personaje);
            case 2 -> prioridad2.encolar(personaje);
            case 3 -> prioridad3.encolar(personaje);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cola getPrioridad1() {
        return prioridad1;
    }

    public void setPrioridad1(Cola prioridad1) {
        this.prioridad1 = prioridad1;
    }

    public Cola getPrioridad2() {
        return prioridad2;
    }

    public void setPrioridad2(Cola prioridad2) {
        this.prioridad2 = prioridad2;
    }

    public Cola getPrioridad3() {
        return prioridad3;
    }

    public void setPrioridad3(Cola prioridad3) {
        this.prioridad3 = prioridad3;
    }

    public Cola getRefuerzo() {
        return refuerzo;
    }

    public void setRefuerzo(Cola refuerzo) {
        this.refuerzo = refuerzo;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

}
