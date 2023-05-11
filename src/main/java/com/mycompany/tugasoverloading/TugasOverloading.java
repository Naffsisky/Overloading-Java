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
        int[] x = {1, 2, 3};
        int[] y = {4, 5, 6};
        int skalar = 5;

        int hasilVectorSkalar = vectorSkalar(x, skalar);
        System.out.println("Hasil vektor X dikali dengan Skalar " + skalar  + " adalah : " + hasilVectorSkalar);
        int hasilVectorVector = vectorVector(x, y);
        System.out.println("Hasil vektor X dikali dengan vektor Y adalah : " + hasilVectorVector);
        
    }
    public static int vectorSkalar(int[] x, int skalar){
        int hasil = 0;
        int j = x.length - 1;
        int z = 0;
        
        for(int i = 0; i < x.length; i++){
            hasil += x[i] * skalar;
            z += x[i] * skalar;
            System.out.print(x[i] + skalar);
            if(i != j){
                System.out.print(" + ");
            }
            if(i == j){
                System.out.println(" = " + z);
            }
        }
        return hasil;
    }
    public static int vectorVector(int[] x, int[] y){
        int hasil = 0;
        int j = x.length - 1;
        int z = 0;
        
        for(int i = 0; i < x.length; i++){
            hasil += x[i] * y[i];
            z += x[i] * y[i];
            System.out.print(x[i] + y[i]);
            if(i != j){
                System.out.print(" + ");
            }
            if(i == j){
                System.out.println(" = " + z);
            }
        }
        return hasil;
    }
}