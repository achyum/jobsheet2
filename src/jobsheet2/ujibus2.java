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
public class ujibus2 {

 private int penumpang;
 private int maxpenumpang;
 
 public ujibus2(int maxpenumpang){
 this.maxpenumpang = maxpenumpang;
 penumpang = 0;
 }
 
 public void addpenumpang(int penumpang){
 int temp;
 temp = this.penumpang+penumpang;
 if (temp >= maxpenumpang){
 System.out.println("penumpang melebihi kuota");
 }
 else{
 this.penumpang = temp;
 }
 }

public void cetak(){
System.out.println("penumpang bus sekarang adalah" +penumpang);
System.out.println("penumpang maksimum seharusnya adalah " +maxpenumpang);
}

public static void main(String[] args) {
        ujibus2 busbesar = new ujibus2(40);
        busbesar.cetak();
        
        busbesar.addpenumpang(15);
        busbesar.cetak();
        
        busbesar.addpenumpang(5);
        busbesar.cetak();
        
        busbesar.addpenumpang(26);
        busbesar.cetak();
    }
}
