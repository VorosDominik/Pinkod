/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pinkod;

/**
 *
 * @author VörösDominik(SZF_202
 */
class Elem {
    public int ertek;
    public int hely;

    public Elem(int ertek, int hely) {
        this.ertek = ertek;
        this.hely = hely;
    }

    public int getErtek() {
        return ertek;
    }

    public int getHely() {
        return hely;
    }

    @Override
    public String toString() {
        return "Elem{" + "ertek=" + ertek + ", hely=" + hely + '}';
    }
    
}
