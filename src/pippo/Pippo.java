/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pippo;
import quadraticequationsolver.*;
import java.io.*;

/**
 *
 * @author user
 */
public class Pippo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String coefficente;
        QuadraticEquationSolver coefficenteA= new QuadraticEquationSolver();
        boolean numero=false;
        while(!false)
        {
            System.out.println("Inserisci il primo coefficente a: ");
            try{
                coefficente=tastiera.readLine();
                coefficenteA.a=Integer.valueOf(coefficente).intValue();
                numero=true;
            }
            catch(Exception e)
            {
                System.out.println("Non hai inserito un corretto numero");
            }
        }
        numero=false;
        
        while(!false)
        {
            System.out.println("Inserisci il coefficente b: ");
            try{
                coefficente=tastiera.readLine();
                coefficenteA.b=Integer.valueOf(coefficente).intValue();
                numero=true;
            }
            catch(Exception e)
            {
                System.out.println("Non hai inserito un corretto numero");
            }
        }
        numero=false;
        
        while(!false)
        {
            System.out.println("Inserisci il coefficente c: ");
            try{
                coefficente=tastiera.readLine();
                coefficenteA.c=Integer.valueOf(coefficente).intValue();
                numero=true;
            }
            catch(Exception e)
            {
                System.out.println("Non hai inserito un corretto numero");
            }
        }
        numero=false;
}
