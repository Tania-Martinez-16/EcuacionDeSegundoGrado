/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author tatia
 */
public class EcuacionDeSegundoGrado {
    // Variables de instancia
    public double a;
    public double b;
    public double c;
    public int numeroDeRaices;
    public double raiz1;
    public double raiz2;
    
    // Constructor
    public EcuacionDeSegundoGrado (double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
    }
    
    // getCoeficienteA
    public double getCoeficienteA(){
        return a;
    }
    
    // getCoeficienteB
    public double getCoeficienteB(){
        return b;
    }
    
    // getCoeficienteC
    public double getCoeficienteC(){
        return c;
    }
    
    // getDiscriminante
    public double getDiscriminante(){
        double discriminante = (b*b) - 4 * a * c;
        return discriminante;
    }
    
    //  getNumeroDeSoluciones
    public double getNumeroDeSolucionesReales(){
        double dis = getDiscriminante();
        if (dis > 0){
            numeroDeRaices = 2;
        }
        else 
            if (dis < 0){
            numeroDeRaices = 0;
        }
            else {
                numeroDeRaices = 1;
            }
        return numeroDeRaices;
    }
    
    // getRaiz1
    public double getRaiz1(){
        raiz1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
        return raiz1;
    }
    
    // getRaiz2
    public double getRaiz2(){
        raiz2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
        return raiz2;
    }
}    