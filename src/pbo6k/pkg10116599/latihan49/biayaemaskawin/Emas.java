/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan49.biayaemaskawin;

/**
 *
 * @author eka
 */
public class Emas {

    double berat;
    double harga;

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double totalBayar(double berat, double harga) {
        return getBerat() * getHarga();
    }

}
