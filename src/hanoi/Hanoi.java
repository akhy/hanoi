/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import library.*;

/**
 *
 * @author akhyar
 */
public class Hanoi {

    Stack[] s = new Stack[4];
    int jumlahRing;

    public static void main(String[] args) {

        Hanoi h = new Hanoi();
        System.out.print("Masukkan jumlah tumpukan ring: ");
        h.jumlahRing = Input.readInt();
        System.out.println("");
        
        h.init();
        int step=0;
        do {
            h.tampil();
            step++;
        } while (h.pindah());
        System.out.println("\n");
        System.out.println("==============================================");
        System.out.println("Selamat anda berhasil memecahkan teka-teki ini!");
        System.out.println("==============================================\n");
        h.tampil();
        System.out.println("\nlangkah yang dibutuhkan: " + step);
    }

    public void init() {
        s[1] = new Stack();
        s[2] = new Stack();
        s[3] = new Stack();
        for (int i = jumlahRing; i >= 1; i--) {
            String x = "" + i;
            s[1].push(x);
        }
    }

    public boolean pindah() {
        int dari = 0, ke = 0, dari_top = 0, ke_top = 0;

        try{
            System.out.print("=> Pindahkan dari tiang nomor: ");
            dari = Input.readInt();
            System.out.print("=> Ke tiang nomor: ");
            ke = Input.readInt();
        }catch (Exception e){
            System.out.println("\nMasukan tidak valid!");
            return true;
        }
        
        try { // periksa tiang sumber
            dari_top = Integer.parseInt((String) (s[dari].getTop().getElemen()));
        } catch (NullPointerException e) {
            System.out.print("\n");
            System.out.println("=====================================");
            System.out.println("Tiang yang mau anda pindahkan kosong!");
            System.out.println("=====================================");
            return true;
        }

        try { //periksa tiang tujuan
            ke_top = Integer.parseInt((String) (s[ke].getTop().getElemen()));
        } catch (NullPointerException e) {
            ke_top = jumlahRing + 1; 
        }

        if (dari_top < ke_top) {
            String dipindah = (String) (s[dari].getTop().getElemen());
            s[ke].push(dipindah);
            s[dari].pop();
        } else {
            System.out.print("\n");
            System.out.println("==================");
            System.out.println("Gerakan tidak sah!");
            System.out.println("==================");
        }

        if (s[3].countElement()==jumlahRing) return false;
        return true;
    }

    public void tampil() {
        for (int i = 1; i <= 3; i++) {
            Elemen tmp;
            System.out.println(i + " =======");
            tmp = s[i].getTop();
            if (tmp == null){
                System.out.println("   -");
            }
            while (tmp != null) {
                System.out.println("   " + tmp.getElemen());

                tmp = tmp.getNext();
            }
            System.out.println("---------\n");

        }

    }
}
