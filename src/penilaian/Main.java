/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaian;

/**
 *
 * @author OKI
 */
public class Main {
    public static void main(String[] args) {
        NilaiAkhir nilai = new NilaiAkhir("Syauqi Ramadhan", "2110010016", 78, 95, 82);

        System.out.println("Nama: " + nilai.getNama());
        System.out.println("NPM: " + nilai.getNpm());
        System.out.println("Nilai Akhir: " + nilai.hitungNilaiAkhir());
    }
    
}
