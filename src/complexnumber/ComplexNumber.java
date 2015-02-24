/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;

/**
 *
 * @author user
 */
public class ComplexNumber {
    /*specificatore di accesso "public" */public float re;
    public float im;
    
    public String FormatComplexNumber(){
        String r;
        /*campi della classe a cui appartiene formatcomplexnumber*/r=this.re+"+("+this.im +")i";/*this è
                l'identificare del campo della stessa classe, quindi ci accedo*/
        return r;
        
    }
}
