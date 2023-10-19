package Tugas3;

public class Robot {
    String nama;
    String warna;
    int berat;

    void PerkenalanDiri(){
        System.out.println("Halo perkenalkan");
        System.out.println("Nama Saya : " + this.nama);
        System.out.println("Warna Saya : " + this.warna);
        System.out.println("Berat Saya : " + this.berat + " Kg");
    }
}
