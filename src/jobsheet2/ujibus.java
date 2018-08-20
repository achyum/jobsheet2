/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author SMK TELKOM
 */
public class ujibus {
    public static void main(String[] args) {
        bus busmini = new bus();
        busmini.penumpang = 10;
        busmini.maxpenumpang = 15;
        busmini.cetak();
        
        busmini.penumpang = busmini.penumpang + 5;
        busmini.cetak();
        
        busmini.penumpang = busmini.penumpang - 2;
        busmini.cetak();
        
        busmini.penumpang = busmini.penumpang + 8;
        busmini.cetak();
    }
}
