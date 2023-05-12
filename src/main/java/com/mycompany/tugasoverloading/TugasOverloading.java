/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasoverloading;

/**
 *
 * @author naffsisky
 */
public class TugasOverloading {

    public static void main(String[] args) {
    Vector3 X = new Vector3(1, 2, 3);
    Vector3 Y = new Vector3(4, 5, 6);
    
    int[] hasilVectorSkalar = X.perhitungan(5);
    System.out.println("Hasil vektor X dikali dengan Skalar : [" + hasilVectorSkalar[0] + " " + hasilVectorSkalar[1] + " " + hasilVectorSkalar[2] + "]");
    
    int hasilVectorVector = X.perhitungan(Y.vectorX);
    System.out.println("Hasil vektor X dikali dengan vektor Y adalah : " + hasilVectorVector);
}

}