/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class Latihan54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koordinat = new Koordinat(10, 4);
        WarnaKoordinat warna = new WarnaKoordinat("Jingga", 10, 4);
        System.out.println("Warna Koordinat : " + warna.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + koordinat.x + ", " + "y : " + 
                        koordinat.y);
    }
    
}
