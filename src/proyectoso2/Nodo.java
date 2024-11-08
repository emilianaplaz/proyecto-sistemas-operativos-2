/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoso2;

/**
 *
 * @author emilianaplaz
 */
public class  Nodo<T> {
    private Personaje elemento;
    private Nodo pNext;

    public Nodo(Personaje elemento, Nodo pNext) {
        this.elemento = elemento;
        this.pNext = pNext;
    }
    
    public Nodo(Personaje elemento) {
        this.elemento = elemento;
        this.pNext = null;
    }

    public Personaje getElemento() {
        return elemento;
    }

    public void setElemento(Personaje elemento) {
        this.elemento = elemento;
    }

    public Nodo getpNext() {
        return pNext;
    }

    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }
}
