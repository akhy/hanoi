/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Dwira Maulana
 */
public class Elemen {

    Object elemen;
    Elemen berikut;

    public Elemen() {
        elemen = new Object();
    }

    public Object getElemen() {
        return elemen;
    }

    public void setElemen(Object elemen) {
        this.elemen = elemen;
    }

    public void setNext(Elemen berikut) {
        this.berikut = berikut;
    }

    public Elemen getNext() {
        return berikut;
    }
}
