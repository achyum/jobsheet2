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
public class testsiswa {
    public static void main(String[] args) {
        encapsiswa siswa = new encapsiswa();
        siswa.setName("julian");
        siswa.setAge(23);
        siswa.getAddress("malang");
        
        System.out.println("name : " +siswa.getName()
        + "absen : " +siswa.getAbsen() +
        "address : " +siswa.getAddress()
        );
}
}
