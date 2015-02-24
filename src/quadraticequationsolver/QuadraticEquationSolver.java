/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequationsolver;
import complexnumber.*;
import java.io.*;
/**
 *
 * @author user
 */
public class QuadraticEquationSolver {
    public float a;
    public float b;
    public float c;
    public float delta=0;
    
    
    public void computeDeterminant(){
        this.delta=(this.b*this.b)-(4*this.a*this.c);
    }
    public ComplexNumber X1(){
        ComplexNumber soluzione= new ComplexNumber();// se fosse stato una variabile esempio record mi fermavo a complenuber soluzione. Ma soluzione non è di tipo complex number ma è di riferimento quindi gli alloco la memoria
        if(delta>=0){
            soluzione.im=0;
            soluzione.re=-this.b+(float)Math.sqrt(this.delta)/(2*this.a);
        }
        else
        {
            soluzione.re=-this.b; //operatore - prima di this, altrimenti errore
            soluzione.im=(float)Math.sqrt(-this.delta)/(2*this.a);
        }
        return soluzione;
    }
    public ComplexNumber X2(){
   ComplexNumber soluzione= new ComplexNumber();// se fosse stato una variabile esempio record mi fermavo a complenuber soluzione. Ma soluzione non è di tipo complex number ma è di riferimento quindi gli alloco la memoria
        if(delta>=0){
            soluzione.im=0;
            soluzione.re=-this.b-(float)Math.sqrt(this.delta)/(2*this.a);
        }
        else
        {
            soluzione.re=-this.b; //operatore - prima di this, altrimenti errore
            soluzione.im=(float)Math.sqrt(-this.delta)/(2*this.a);
        }
        return soluzione;
    }     
}
