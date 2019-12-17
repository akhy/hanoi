/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import library.Elemen;

/**
 *
 * @author Dwira Maulana
 */
public class Stack {

    private Elemen top;

    public Stack() {
        top = null;
    }

    public boolean cekKosong() { //empty()
        boolean hasil = false;
        if (top == null) {
            hasil = true;
        }
        return hasil;
    }

    public int countElement() {
        int hasil = 0;
        if (top != null) {
            /*stack tidak kosong*/
            Elemen elmt;
            /*inisialisasi*/
            elmt = top;
            while (elmt != null) {
                /*proses*/
                hasil = hasil + 1;
                /*iterasi*/
                elmt = elmt.getNext();
            }
        }
        return hasil;
    }

    public void push(Object objt) {
        Elemen elmt;
        elmt = new Elemen();
        elmt.setElemen(objt);
        elmt.setNext(top);
        top = elmt;
    }

    public void pop() {
        if (top != null) {
            /*jika stack bukan list kosong*/
            Elemen elmt = top;
            top = top.getNext();
            elmt.setNext(null);

        }
    }

    public Elemen getTop() { //peek()
        return top;
    }
}
