/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasoverloading;

/**
 *
 * @author naffsisky
 */
public class TugasOverloading {
    private int[] x;
    private int[] y;
    private int skalar;
    
    public TugasOverloading(int[] x, int[] y, int skalar) {
        this.x = x;
        this.y = y;
        this.skalar = skalar;
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        int[] y = {4, 5, 6};
        int skalar = 5;

        TugasOverloading obj = new TugasOverloading(x, y, skalar);

        int hasilVectorSkalar = obj.vectorSkalar();
        System.out.println("Hasil vektor X dikali dengan Skalar " + skalar + " adalah : " + hasilVectorSkalar);

        int hasilVectorVector = obj.vectorVector();
        System.out.println("Hasil vektor X dikali dengan vektor Y adalah : " + hasilVectorVector);
    }

    public int vectorSkalar() {
        int hasil = 0;
        int j = x.length - 1;
        int z = 0;

        for (int i = 0; i < x.length; i++) {
            hasil += x[i] * skalar;
            z += x[i] * skalar;
            System.out.print(x[i] + "*" + skalar);
            if (i != j) {
                System.out.print(" + ");
            }
            if (i == j) {
                System.out.println(" = " + z);
            }
        }
        return hasil;
    }

    public int vectorVector() {
        int hasil = 0;
        int j = x.length - 1;
        int z = 0;

        for (int i = 0; i < x.length; i++) {
            hasil += x[i] * y[i];
            z += x[i] * y[i];
            System.out.print(x[i] + "*" + y[i]);
            if (i != j) {
                System.out.print(" + ");
            }
            if (i == j) {
                System.out.println(" = " + z);
            }
        }
        return hasil;
    }
}
