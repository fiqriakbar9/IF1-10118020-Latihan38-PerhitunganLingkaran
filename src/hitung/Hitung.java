/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menghitung lingkaran
 * dan berbasis objek oriented
 */
public class Hitung {

    public double jarijari;
    public double luas; //luas
    public double keliling; //keliling

    public double jariLingkaran(double diameter) {
        jarijari = diameter / 2;
        return jarijari;
    }

    public double luasLingkaran(double jarijari) {
        luas = Math.PI * jarijari * jarijari;
        return luas;
    }

    public double kelilingLingkaran(double jarijari) {
        keliling = 2 * Math.PI * jarijari;
        return keliling;
    }
}
    