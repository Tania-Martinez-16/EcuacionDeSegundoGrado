/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciondesegundogrado;

import java.util.Scanner;
import modelo.EcuacionDeSegundoGrado;

/**
 *
 * @author tatia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
    
    // 1er Caso
        // Objeto
        EcuacionDeSegundoGrado miEcuacionNo1 = new EcuacionDeSegundoGrado(8, 6, -15);

        // Cálculo
        System.out.println(" Valor del discriminante:  " + miEcuacionNo1.getDiscriminante());
        System.out.println(" Número de Raices:  " + miEcuacionNo1.getNumeroDeSolucionesReales());
        System.out.println(" x1= " + miEcuacionNo1.getRaiz1());
        System.out.println(" x2= " + miEcuacionNo1.getRaiz2());
        
    System.out.println("____________________________________________________________________");    
    
        // 2do Caso
        // Objeto
        EcuacionDeSegundoGrado miEcuacionNo2 = new EcuacionDeSegundoGrado(10, 5, 0);

        // Cálculo
        System.out.println(" Valor del discriminante:  " + miEcuacionNo2.getDiscriminante());
        System.out.println(" Número de Raices:  " + miEcuacionNo2.getNumeroDeSolucionesReales());
        System.out.println(" x1= " + miEcuacionNo2.getRaiz1());
        System.out.println(" x2= " + miEcuacionNo2.getRaiz2());
        
    System.out.println("____________________________________________________________________");
   
        // 3er Caso
        // Objeto
        EcuacionDeSegundoGrado miEcuacionNo3 = new EcuacionDeSegundoGrado(-20, -7, 2);

        // Cálculo
        System.out.println(" Valor del discriminante:  " + miEcuacionNo3.getDiscriminante());
        System.out.println(" Número de Raices:  " + miEcuacionNo3.getNumeroDeSolucionesReales());
        System.out.println(" x1= " + miEcuacionNo3.getRaiz1());
        System.out.println(" x2= " + miEcuacionNo3.getRaiz2());
        
    } 
}
