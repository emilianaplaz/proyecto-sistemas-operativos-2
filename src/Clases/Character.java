/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author emilianaplaz
 */
public class Character {
    
    private String name;
    private String object;
    private int id;
    private int counter=0;
    private int nivel;
    private int numCalidad;
    private int habilidad;
    private int hp;
    private int fuerza;
    private int agilidad;

    public Character(String name, String object, int id) {
        this.name = name;
        this.object = object;
        this.id = id;
    }
    
    public void CalcularStats() {
        int stat= (int) (Math.random()*100);
        
        if(stat>=0 && stat<60){
            this.habilidad=2;
            this.numCalidad++;
        } else {
            this.habilidad=0;
        }
        if(stat>=0 && stat<70) {
            this.hp=3;
            this.numCalidad++;
        } else {
            this.hp=1;
        }
        if(stat>=0 && stat<50){
            this.fuerza=4;
            this.numCalidad++;
        } else {
            this.fuerza=0;
        }
        if(stat>=0 && stat<40){
            this.agilidad=5;
            this.numCalidad++;
        } else {
            this.agilidad=0;
        }
        
        if(this.numCalidad==4) {
            this.nivel=1;
        }
        else if(this.numCalidad<=3 && this.numCalidad>=2) {
            this.nivel=2;
        }
        else if (this.numCalidad<=1 && this.numCalidad>=0) {
            this.nivel=3;
        }
        
       if (this.object.compareTo("Lightsaber")==0) {
           this.habilidad+=2;
           this.hp+=3;
       }
       else if(this.object.compareTo("Pistola")==0){
           this.fuerza+=3;
           this.habilidad+=2;
           this.agilidad++;
       }
       
       else if(this.object.compareTo("La Fuerza")==0) {
           this.habilidad+=3;
           this.agilidad+=2;
           this.fuerza++;
       }
       
       else if(this.object.compareTo("Blaster")==0){
           this.agilidad+=4;
           this.hp+=2;
           this.habilidad+=2;
       }
       
       else if(this.object.compareTo("Phaser")==0){
           this.fuerza+=2;
           this.hp+=2;
       }
       
       else if(this.object.compareTo("Espada Bat´telh")==0){
           this.agilidad+=3;
           this.fuerza+=2;
       }
       
       else if(this.object.compareTo("Lirpa")==0){
           this.hp+=2;
           this.fuerza+=4;
           this.agilidad+=3;
       }
       else if(this.object.compareTo("Puñal D´kTahg")==0){
           this.agilidad+=4;
           this.habilidad+=2;
           this.hp+=2;
       }
       
       else if(this.object.compareTo("Látigo láser")==0){
           this.fuerza+=4;
           this.habilidad+=3;
           this.hp++;
       }
       
       else if(this.object.compareTo("Disruptor romulano")==0){
           this.hp+=4;
           this.agilidad+=2;
       }
    
    }

    public int getNumCalidad() {
        return numCalidad;
    }

    public void setNumCalidad(int numCalidad) {
        this.numCalidad = numCalidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }
}
