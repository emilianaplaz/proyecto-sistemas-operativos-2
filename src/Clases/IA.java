/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaces.Global;
import Interfaces.Interfaz;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 * @author Emiliana Plaz
 * @author Stefano Boschetti
 */
public class IA extends Thread {

    private Character p1; //Personaje de Star Trek
    private Character p2; //Personaje de Star Wars
    private int StarTrekGana;
    private int StarWarsGana;
    private String state;
    private int WaitingTime;

    public IA() {
        this.p1 = null;
        this.p2 = null;
        this.StarTrekGana = 0;
        this.StarWarsGana = 0;
        this.state = "Esperando...";
        this.WaitingTime = 10000;
    }

    public Character getP1() {
        return p1;
    }

    public void setP1(Character p1) {
        this.p1 = p1;
    }

    public Character getP2() {
        return p2;
    }

    public void setP2(Character p2) {
        this.p2 = p2;
    }

    public int getWaitingTime() {
        return WaitingTime;
    }

    public void setWaitingTime(int WaitingTime) {
        this.WaitingTime = WaitingTime;
    }

    @Override
    public void run() {
        try {
            // Se selecciona el resultado de la batalla.
            int resultado = (int) (Math.random() * 100);
            // (a) 40% de existir un ganador 
            // (b) 27% de ocurrir un empate 
            // (c) 33% de no llevarse a cabo el combate 

            this.state = "Decidiendo";
            Interfaz.getIAState().setText(this.state);
            // Duerme durante 10 segundos en los que "analiza".
            sleep(this.WaitingTime);
            // Y genera un resultado.
            this.state = "Anunciando resultados";
            Interfaz.getIAState().setText(this.state);
            Character ganador;
            System.out.println("decision: " + resultado);

            // Resultado (a) hay un ganador.
            if (resultado < 40) {
                System.out.println("Hay un ganador, combatientes: " + p1.getName() + " " + p2.getName());
                System.out.println("personaje 1, id: " + p1.getId() + " nombre " + p1.getName() + " stats:\nAgilidad: " + p1.getAgilidad() + "\nFuerza: " + p1.getFuerza() + "\nHabilidad: " + p1.getHabilidad() + "\nHP: " + p1.getHp());
                System.out.println("personaje 2, id: " + p2.getId() + " nombre " + p2.getName() + " stats:\nAgilidad: " + p2.getAgilidad() + "\nFuerza: " + p2.getFuerza() + "\nHabilidad: " + p2.getHabilidad() + "\nHP: " + p2.getHp());
                Interfaz.getResultadoCombate().setText("Hubo un ganador!");

                ganador = Ganador();
                Global.getGanadores().insertBegin(ganador);
                
            // Resultado (b) hay empate.
            } else if (resultado >= 40 && resultado < 67) {
                System.out.println("Hubo empate");
                Interfaz.getResultadoCombate().setText("Hubo un empate!");
                Global.getStudioStarTrek().getPrioridad1().encolar(p1);
                Global.getStudioStarWars().getPrioridad1().encolar(p2);
                
            // Resultado (c) no sucede el combate.
            } else if (resultado >= 67 && resultado < 100) {
                System.out.println("El combate ha sido cancelado!");
                Interfaz.getResultadoCombate().setText("Suspendido!");
                Global.getStudioStarTrek().getRefuerzo().encolar(p1);
                Global.getStudioStarWars().getRefuerzo().encolar(p2);
                Interfaz.getRefuerzoStarTrek().setText(Global.getStudioStarTrek().getRefuerzo().imprimir());
                Interfaz.getRefuerzoStarWars().setText(Global.getStudioStarWars().getRefuerzo().imprimir());
            }
            
            // Duerme durante un tiempo para que se puedan visualizar los resultados.
            sleep(this.WaitingTime/3);

            this.state = "Esperando...";
            Interfaz.getIAState().setText(this.state);
            Interfaz.getResultadoCombate().setText("Esperando...");
            
        } catch (InterruptedException ex) {
            Logger.getLogger(IA.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Character Ganador() {
        // Se determina cual personaje gano el combate.
        int ventajaP1 = 0;
        int ventajaP2 = 0;

        // Se compara su agilidad.
        if (p1.getAgilidad() > p2.getAgilidad()) {
            ventajaP1++;
        } else {
            ventajaP2++;
        }

        // Se compara su fuerza.
        if (p1.getFuerza() >= p2.getFuerza()) {
            ventajaP1++;
        } else {
            ventajaP2++;
        }

        // Se compara su habilidad.
        if (p1.getHabilidad() > p2.getHabilidad()) {
            ventajaP1++;
        } else {
            ventajaP2++;
        }

        // Se compara su vida o resistencia.
        if (p1.getHp() >= p2.getHp()) {
            ventajaP1++;
        } else {
            ventajaP2++;
        }

        // Se determina que personaje tuvo ventaja sobre el otro.
        if (ventajaP1 > ventajaP2) {
            // GANA P1.
            System.out.println(p1.getName() + " es el ganador");
            Interfaz.getListaGanadores().append("StarTrek-" + p1.getId() + '\n');
            Interfaz.getCharacterIconStarWars().setIcon(new ImageIcon(getClass().getResource("/InterfaceImages/placeholder.png"))); // Se quita la foto del perdedor
            this.StarTrekGana++;
            Interfaz.getMarcadorStarTrek().setText(Integer.toString(this.StarTrekGana));
            return p1;
        } else {
            // GANA P2.
            System.out.println(p2.getName() + " es el ganador");
            Interfaz.getListaGanadores().append("StarWars-" + p2.getId() + '\n');
            Interfaz.getCharacterIconStarTrek().setIcon(new ImageIcon(getClass().getResource("/InterfaceImages/placeholder.png"))); // Se quita la foto del Perdedor
            this.StarWarsGana++;
            Interfaz.getMarcadorStarWars().setText(Integer.toString(this.StarWarsGana));

            return p2;
        }

    }

}
