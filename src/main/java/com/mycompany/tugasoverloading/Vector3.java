/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasoverloading;

/**
 *
 * @author naffsisky
 */
public class Vector3 {
    public int[] vectorX;
    
    public Vector3(int x, int y, int z){
        this.vectorX = new int[]{x, y, z};
    }
    
    public int[] perhitungan(int skalar){
     int[] hasil = new int[3];
     for (int i = 0; i < vectorX.length; i++){
         hasil[i] = vectorX[i] * skalar;
     }
     return hasil;
    }
    
    public int perhitungan(int[] vectorY){
     int hasil = 0;
     for (int i = 0; i < vectorX.length; i++){
         hasil += vectorX[i] * vectorY[i];
     }
     return hasil;
    }
}
