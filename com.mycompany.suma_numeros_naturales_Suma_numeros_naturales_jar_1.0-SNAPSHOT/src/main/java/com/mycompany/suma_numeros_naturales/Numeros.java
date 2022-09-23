/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.suma_numeros_naturales;

/**
 *
 * @author CC7
 */
public class Numeros {
    public int Calcula(int num){
        int n=num;
        
        if(n==0){
            return 0;
            
        }else{
            return n+Calcula(n-1);
            
        }
    
    }
}
