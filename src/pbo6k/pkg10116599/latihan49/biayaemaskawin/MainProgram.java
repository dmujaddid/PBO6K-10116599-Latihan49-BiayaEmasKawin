/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan49.biayaemaskawin;

/**
 *
 * @author NAMA : Robby Eka Purnama KELAS : PBO6K NIM : 10116599 Deskripsi
 * Program : Program untuk menghitung biaya mahar emas kawin.
 *
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Inisialisasi
        Emas emas = new Emas();
        
        // Input nilai
        emas.setBerat(15.7);
        emas.setHarga(570000);
        
        // Output 
        System.out.println("Berat emas (gram) : " + emas.getBerat());
        System.out.println("Harga 1 gr emas per bulan Oktober : Rp " + emas.getHarga());
        System.out.println("Total bayar : " + emas.totalBayar(0, 0));
    }

}
