/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pinkod;

import java.util.Scanner;

/**
 *
 * @author VörösDominik(SZF_202
 */
public class PinKod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         feladat1();
     
      
    }

    private static int pinkodbevitel(String szoveg) {
       
        Scanner src = new Scanner(System.in);
        System.out.print(szoveg);       
        int p_k = src.nextInt();
        
        return p_k;
    
    }

    private static int elenorzottpin() {
        int pin=0;
        boolean helyespin=false;
        while (helyespin==false) {            
             pin=pinkodbevitel("Adja meg a pinkódot(4 számjegy):");
            if (pin>999 && pin<1000000) {
                System.out.println("pin elmentve!1");
                helyespin=true;
            }
            else{
                System.out.println("nem megfelelő formátum 4-6 számjegy között");
            }
        }
        return pin;
    }

    private static String pinkodoszehasonlitas(int pinkod) {
    int hibalehetoseg=3;
    String szoveg="";
        for (int i = 0; i < hibalehetoseg; i++) {
            System.out.printf("Kérem a belépési kódot("+i+"/3):");
            int proba=pinkodbevitel("");
            
            if (proba==pinkod) {
                return "helyes pinkód!";
            }
            System.out.println("A pinkód helytelen");
            
        }
        return "helytelen pinkód rendszer le áll!";
    }

    private static void feladat1() {
     int pinkod=elenorzottpin();
          System.out.println(pinkodoszehasonlitas(pinkod));
    }
    
}
