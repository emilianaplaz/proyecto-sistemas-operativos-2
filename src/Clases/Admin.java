/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Nodo;
import Interfaces.Global;
import Interfaces.Interfaz;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 * @author Emiliana Plaz
 * @author Stefano Boschetti
 */
public class Admin extends Thread {

    private int ciclo; //cada 2 ciclos se revisa la probabilidad de que se creen personajes nuevos.
    public IA ia; //la IA con el que el Admin va a estar trabajando
    private Semaphore mutex1; //Semaforo de StarTrek
    private Semaphore mutex2; //Semaforo de StarWars
    private int IdCh = 0;

    public Admin(IA ia) {
        this.ciclo = 0;
        this.ia = ia;
        this.mutex1 = new Semaphore(1);
        this.mutex2 = new Semaphore(1);

    }

    @Override
    public void run() {
        while (true) {
            try {
                // Primero revisas si todas las colas de ambas franquicias estan vacias.
                // Si lo estan generamos un personaje aleatorio con un objeto aleatorio.
                checkEmpty();

                // Seleccionamos el personaje de StarTrek que se utilizara.
                mutex1.acquire(); //Wait del semáforo de StarTrek para conseguir el personaje
                if (Global.getStudioStarTrek().getPrioridad1().getSize() > 0) {
                    // Si hay disponible personajes en la cola de prioridad 1, se toma el primero de esta cola.
                    this.ia.setP1(Global.getStudioStarTrek().getPrioridad1().desencolar().getElement());
                    Interfaz.getPrioridad1StarTrek().setText(Global.getStudioStarTrek().getPrioridad1().imprimir());

                } else if (Global.getStudioStarTrek().getPrioridad2().getSize() > 0) {
                    // Si hay disponible personajes en la cola de prioridad 2 y no de ninguna superior, se toma el primero de esta cola.
                    this.ia.setP1(Global.getStudioStarTrek().getPrioridad2().desencolar().getElement());
                    Interfaz.getPrioridad2StarTrek().setText(Global.getStudioStarTrek().getPrioridad2().imprimir());

                } else if (Global.getStudioStarTrek().getPrioridad3().getSize() > 0) {
                    // Si hay disponible personajes en la cola de prioridad 3 y no de ninguna superior, se toma el primero de esta cola.
                    this.ia.setP1(Global.getStudioStarTrek().getPrioridad3().desencolar().getElement());
                    Interfaz.getPrioridad3StarTrek().setText(Global.getStudioStarTrek().getPrioridad3().imprimir());
                }
                System.out.println("Se escogio un de personaje de StarTrek");
                mutex1.release(); //Se cierra la zona crítica de StarTrek 

                //Se cambian las stats del intefaz al personaje actual de StarTrek 
                changeStatsStudioStarTrek(); 

                // Ahora seleccionamos el personaje de Star Wars.
                mutex2.acquire(); //Wait del Semáforo de StarWars para conseguir el personaje
                if (Global.getStudioStarWars().getPrioridad1().getSize() > 0) {
                    // Si hay disponible personajes en la cola de prioridad 1, se toma el primero de esta cola.
                    this.ia.setP2(Global.getStudioStarWars().getPrioridad1().desencolar().getElement());
                    Interfaz.getPrioridad1StarWars().setText(Global.getStudioStarWars().getPrioridad1().imprimir());

                } else if (Global.getStudioStarWars().getPrioridad2().getSize() > 0) {
                    // Si hay disponible personajes en la cola de prioridad 2 y no de ninguna superior, se toma el primero de esta cola.
                    this.ia.setP2(Global.getStudioStarWars().getPrioridad2().desencolar().getElement());
                    Interfaz.getPrioridad2StarWars().setText(Global.getStudioStarWars().getPrioridad2().imprimir());

                } else if (Global.getStudioStarWars().getPrioridad3().getSize() > 0) {
                    // Si hay disponible personajes en la cola de prioridad 3 y no de ninguna superior, se toma el primero de esta cola.
                    this.ia.setP2(Global.getStudioStarWars().getPrioridad3().desencolar().getElement());
                    Interfaz.getPrioridad3StarWars().setText(Global.getStudioStarWars().getPrioridad3().imprimir());
                }
                System.out.println("Se escogio un personaje de StarWars");
                mutex2.release(); //Se cierra la zona crítica de StarWars

                //Se cambian las stats del intefaz al personaje actual de StarWars
                changeStatsStudioStarWars();
                // Se actualizan las imagenes.
                changeIcons();
                // Se inicia la IA para que decida el resultado de la simulación.
                this.ia.run();
                // Se limpian las stats del interfaz.
                clearStats();
                // Se aumenta el contador de ciclos.
                this.ciclo++;

                // Se actualizan las colas de para aumentar la prioridad de aquellos personajes con contador igual a 8.
                ActualizarColas();

                //Se terminó el combate y se actualizaron las colas, entonces, revisamos las listas de refuerzos
                // *** STARTREK LISTA DE REFUERZOS***
                if (Global.getStudioStarTrek().getRefuerzo().getSize() > 0) {
                    int chance = (int) (Math.random() * 100);
                    mutex1.acquire();
                    // Si obtenemos un numero menor o igual a 40. Entonces el personaje entra a la cola de primera prioridad.
                    if (chance >= 0 && chance <= 40) {
                        System.out.println("Un personaje de StarTrek salió de la cola de refuerzos");
                        Nodo character = Global.getStudioStarTrek().getRefuerzo().desencolar();
                        Global.getStudioStarTrek().getPrioridad1().encolar(character.getElement());
                        // Actualizamos las colas en el Interfaz.
                        Interfaz.getRefuerzoStarTrek().setText(Global.getStudioStarTrek().getRefuerzo().imprimir());
                        Interfaz.getPrioridad1StarTrek().setText(Global.getStudioStarTrek().getPrioridad1().imprimir());
                    } else {
                        // Si no se manda al fondo de la cola de refuerzo.
                        System.out.println("Un personaje de StarTrek se mandó al final de la cola de refuerzos");
                        Nodo character = Global.getStudioStarTrek().getRefuerzo().desencolar();
                        Global.getStudioStarTrek().getRefuerzo().encolar(character.getElement());
                        // Actualizamos la cola en el Interfaz.
                        Interfaz.getRefuerzoStarTrek().setText(Global.getStudioStarTrek().getRefuerzo().imprimir());
                    }
                    mutex1.release();
                }

                // *** STARWARS LISTA DE REFUERZOS***
                if (Global.getStudioStarWars().getRefuerzo().getSize() > 0) {
                    int chance = (int) (Math.random() * 100);
                    mutex2.acquire();
                    // Si obtenemos un numero menor o igual a 40. Entonces el personaje entra a la cola de primera prioridad.
                    if (chance >= 0 && chance <= 40) {
                        System.out.println("Un personaje de StudioStarWars salió de la cola de refuerzos");
                        Nodo character = Global.getStudioStarWars().getRefuerzo().desencolar();
                        Global.getStudioStarWars().getPrioridad1().encolar(character.getElement());
                        // Actualizamos las colas en el Interfaz.
                        Interfaz.getRefuerzoStarWars().setText(Global.getStudioStarWars().getRefuerzo().imprimir());
                        Interfaz.getPrioridad1StarWars().setText(Global.getStudioStarWars().getPrioridad1().imprimir());
                    } else {
                        System.out.println("Un personaje de StudioStarWars se mandó al final de la cola de refuerzos");
                        Nodo character = Global.getStudioStarWars().getRefuerzo().desencolar();
                        Global.getStudioStarWars().getRefuerzo().encolar(character.getElement());
                        // Actualizamos la cola en el Interfaz.
                        Interfaz.getRefuerzoStarWars().setText(Global.getStudioStarWars().getRefuerzo().imprimir());
                    }
                    mutex2.release();
                }

                // Ahora decidimos si se creara un nuevo personaje o no.
                if (this.ciclo == 2) {//se revisa si ya pasaron 2 ciclos
                    int crear = (int) (Math.random() * 100);

                    // Si obtenemos un numero menor o igual a 80, entonces se agrega un personaje de cada serie.
                    if (crear >= 0 && crear < 80) {
                        AgregarPersonaje();
                    }
                    // Sin importar si se crearon o no, se reinicia el contador de ciclos.
                    this.ciclo = 0;
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(IA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //antes de llamar a esta funcion se debe verificar que entro en el 80%
    public void AgregarPersonaje() {
        // Creamos un personaje aleatorio de StarTrek.
        int numP = (int) (Math.random() * Global.getStarTrek().length);
        int numO = (int) (Math.random() * Global.getObjetos().length);
        Global.getStudioStarTrek().CreateCharacter(Global.getStarTrek()[numP], Global.getObjetos()[numO], IdCh);
        IdCh++;

        // Creamos un personaje aleatorio de StarWars.
        numP = (int) (Math.random() * Global.getStarWars().length);
        numO = (int) (Math.random() * Global.getObjetos().length);
        Global.getStudioStarWars().CreateCharacter(Global.getStarWars()[numP], Global.getObjetos()[numO], IdCh);
        IdCh++;

    }

    public void ActualizarColas() {
        // Se aumenta el contador de rondas de todos los personajes.
        Global.getStudioStarTrek().getPrioridad2().subirContador();
        Global.getStudioStarTrek().getPrioridad3().subirContador();
        Global.getStudioStarWars().getPrioridad2().subirContador();
        Global.getStudioStarWars().getPrioridad3().subirContador();

        // Ahora actualizamos la cola en la que se encuentran los personajes que llevan 8 rondas completadas.
        // Los personajes en colas de prioridad 1 no deben aumentar su prioridad así que no se toman en cuenta.
        //  ***STAR WARS***
        // StarWars cola de prioridad 2.
        for (Nodo aux = Global.getStudioStarWars().getPrioridad2().getFirst(); aux != null; aux = aux.getNext()) {
            // Si el contador del personaje es 8 debe subir a la siguente cola de prioridad.
            if (aux.getElement().getCounter() == 8) {
                // Se aumenta el nivel del personaje.
                aux.getElement().setNivel(aux.getElement().getNivel() + 1);
                // Se resetea su contador.
                aux.getElement().setCounter(0);
                // Buscamos el indice del elemento a borrar.
                int indice = Global.getStudioStarWars().getPrioridad2().Buscar(aux);
                // Si es el primero lo desencolamos.
                if (indice == 0) {
                    Global.getStudioStarWars().getPrioridad2().desencolar();
                } // Si no lo buscamos y lo borramos
                else {
                    Global.getStudioStarWars().getPrioridad2().borrar(indice);
                }
                // Finalmente lo encolamos en la cola de primera prioridad.
                Global.getStudioStarWars().getPrioridad1().encolar(aux.getElement());
            }
        }
        // Actualizamos las colas de prioridad en la interfaz.
        Interfaz.getPrioridad1StarWars().setText(Global.getStudioStarWars().getPrioridad1().imprimir());
        Interfaz.getPrioridad2StarWars().setText(Global.getStudioStarWars().getPrioridad2().imprimir());

        // StarWars cola de prioridad 3.
        for (Nodo aux = Global.getStudioStarWars().getPrioridad3().getFirst(); aux != null; aux = aux.getNext()) {
            // Si el contador del personaje es 8 debe subir a la siguente cola de prioridad.
            if (aux.getElement().getCounter() == 8) {
                // Se aumenta el nivel del personaje.
                aux.getElement().setNivel(aux.getElement().getNivel() + 1);
                // Se resetea su contador.
                aux.getElement().setCounter(0);
                // Buscamos el indice del elemento a borrar.
                int indice = Global.getStudioStarWars().getPrioridad3().Buscar(aux);
                // Si es el primero lo desencolamos.
                if (indice == 0) {
                    Global.getStudioStarWars().getPrioridad3().desencolar();
                } // Si no lo buscamos y lo borramos
                else {
                    Global.getStudioStarWars().getPrioridad3().borrar(indice);
                }
                // Finalmente lo encolamos en la cola de segunda prioridad.
                Global.getStudioStarWars().getPrioridad2().encolar(aux.getElement());
            }
        }
        // Actualizamos las colas de prioridad en la interfaz.
        Interfaz.getPrioridad2StarWars().setText(Global.getStudioStarWars().getPrioridad2().imprimir());
        Interfaz.getPrioridad3StarWars().setText(Global.getStudioStarWars().getPrioridad3().imprimir());

        //  ***STAR TREK***
        // StarTrek cola de prioridad 2.
        for (Nodo aux = Global.getStudioStarTrek().getPrioridad2().getFirst(); aux != null; aux = aux.getNext()) {
            // Si el contador del personaje es 8 debe subir a la siguente cola de prioridad.
            if (aux.getElement().getCounter() == 8) {
                // Se aumenta el nivel del personaje.
                aux.getElement().setNivel(aux.getElement().getNivel() + 1);
                // Se resetea su contador.
                aux.getElement().setCounter(0);
                // Buscamos el indice del elemento a borrar.
                int indice = Global.getStudioStarTrek().getPrioridad2().Buscar(aux);
                // Si es el primero lo desencolamos.
                if (indice == 0) {
                    Global.getStudioStarTrek().getPrioridad2().desencolar();
                } // Si no lo buscamos y lo borramos
                else {
                    Global.getStudioStarTrek().getPrioridad2().borrar(indice);
                }
                // Finalmente lo encolamos en la cola de primera prioridad.
                Global.getStudioStarTrek().getPrioridad1().encolar(aux.getElement());
            }
        }
        // Actualizamos las colas de prioridad en la interfaz.
        Interfaz.getPrioridad1StarTrek().setText(Global.getStudioStarTrek().getPrioridad1().imprimir());
        Interfaz.getPrioridad2StarTrek().setText(Global.getStudioStarTrek().getPrioridad2().imprimir());

        // StarTrek cola de prioridad 3.
        for (Nodo aux = Global.getStudioStarTrek().getPrioridad3().getFirst(); aux != null; aux = aux.getNext()) {
            // Si el contador del personaje es 8 debe subir a la siguente cola de prioridad.
            if (aux.getElement().getCounter() == 8) {
                // Se aumenta el nivel del personaje.
                aux.getElement().setNivel(aux.getElement().getNivel() + 1);
                // Se resetea su contador.
                aux.getElement().setCounter(0);
                // Buscamos el indice del elemento a borrar.
                int indice = Global.getStudioStarTrek().getPrioridad3().Buscar(aux);
                // Si es el primero lo desencolamos.
                if (indice == 0) {
                    Global.getStudioStarTrek().getPrioridad3().desencolar();
                } // Si no lo buscamos y lo borramos
                else {
                    Global.getStudioStarTrek().getPrioridad3().borrar(indice);
                }
                // Finalmente lo encolamos en la cola de segunda prioridad.
                Global.getStudioStarTrek().getPrioridad2().encolar(aux.getElement());
            }
        }
        // Actualizamos las colas de prioridad en la interfaz.
        Interfaz.getPrioridad2StarTrek().setText(Global.getStudioStarTrek().getPrioridad2().imprimir());
        Interfaz.getPrioridad3StarTrek().setText(Global.getStudioStarTrek().getPrioridad3().imprimir());
    }

    public int getIdCh() {
        return IdCh;
    }

    public void setIdCh(int IdCh) {
        this.IdCh = IdCh;
    }

    public void changeIcons() {
        // Cambiamos las imagenes de los personajes.
        Interfaz.getCharacterIconStarWars().setIcon(new ImageIcon(getClass().getResource("/InterfaceImages/" + this.ia.getP2().getName() + ".png")));
        Interfaz.getCharacterIconStarTrek().setIcon(new ImageIcon(getClass().getResource("/InterfaceImages/" + this.ia.getP1().getName() + ".png")));
    }

    public void changeStatsStudioStarTrek() {
        // Cambiamos las estadisticas del personaje de StatTrek en la interfaz.
        Interfaz.getObjeto_StarTrek().setText(this.ia.getP1().getObject());
        Interfaz.getHabilidad_StarTrek().setText(Integer.toString(this.ia.getP1().getHabilidad()));
        Interfaz.getFuerza_StarTrek().setText(Integer.toString(this.ia.getP1().getFuerza()));
        Interfaz.getHP_StarTrek().setText(Integer.toString(this.ia.getP1().getHp()));
        Interfaz.getAgilidad_StarTrek().setText(Integer.toString(this.ia.getP1().getAgilidad()));
    }

    public void changeStatsStudioStarWars() {
        // Cambiamos las estadisticas del personaje de StatWars en la interfaz.
        Interfaz.getObjeto_StarWars().setText(this.ia.getP2().getObject());
        Interfaz.getHabilidad_StarWars().setText(Integer.toString(this.ia.getP2().getHabilidad()));
        Interfaz.getFuerza_StarWars().setText(Integer.toString(this.ia.getP2().getFuerza()));
        Interfaz.getHP_StarWars().setText(Integer.toString(this.ia.getP2().getHp()));
        Interfaz.getAgilidad_StarWars().setText(Integer.toString(this.ia.getP2().getAgilidad()));
    }

    public void clearStats() {
        // Quitamos las estadisticas del interfaz.
        
        // STAR TREK
        Interfaz.getObjeto_StarTrek().setText("-");
        Interfaz.getHabilidad_StarTrek().setText("-");
        Interfaz.getFuerza_StarTrek().setText("-");
        Interfaz.getHP_StarTrek().setText("-");
        Interfaz.getAgilidad_StarTrek().setText("-");
        
        // STAR WARS
        Interfaz.getObjeto_StarWars().setText("-");
        Interfaz.getHabilidad_StarWars().setText("-");
        Interfaz.getFuerza_StarWars().setText("-");
        Interfaz.getHP_StarWars().setText("-");
        Interfaz.getAgilidad_StarWars().setText("-");
    }

    public void clearIcons() {
        Interfaz.getCharacterIconStarWars().setIcon(new ImageIcon(getClass().getResource("/InterfaceImages/Yugi.png")));
        Interfaz.getCharacterIconStarTrek().setIcon(new ImageIcon(getClass().getResource("/InterfaceImages/Yugi.png")));
    }

    public void checkEmpty() {
        // Si todas las colas de prioridad de StarTrek estan vacias, se crea un personaje aleatorio y se le otorga un objeto aleatorio.
        if (Global.getStudioStarTrek().getPrioridad1().getSize() == 0
                && Global.getStudioStarTrek().getPrioridad2().getSize() == 0
                && Global.getStudioStarTrek().getPrioridad3().getSize() == 0) {
            int numP = (int) (Math.random() * Global.getStarTrek().length);
            int numO = (int) (Math.random() * Global.getObjetos().length);
            Global.getStudioStarTrek().CreateCharacter(Global.getStarTrek()[numP], Global.getObjetos()[numO], IdCh);
            IdCh++;
        }

        // Si todas las colas de prioridad de StarWars estan vacias, se crea un personaje aleatorio y se le otorga un objeto aleatorio.
        if (Global.getStudioStarWars().getPrioridad1().getSize() == 0
                && Global.getStudioStarWars().getPrioridad2().getSize() == 0
                && Global.getStudioStarWars().getPrioridad3().getSize() == 0) {
            int numP = (int) (Math.random() * Global.getStarWars().length);
            int numO = (int) (Math.random() * Global.getObjetos().length);
            Global.getStudioStarWars().CreateCharacter(Global.getStarWars()[numP], Global.getObjetos()[numO], IdCh);
            IdCh++;
        }
    }

}
