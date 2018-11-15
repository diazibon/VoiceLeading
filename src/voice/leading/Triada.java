/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voice.leading;

/**
 *
 * @author Ibon
 */
public class Triada implements Acorde{

    private Note triada[]=new Note[3];
    
    public Triada(int grado, Key tono){
        
        triada[0]=tono.escala[grado];
        triada[1]=Intervals.upDiatonic(triada[0], 2, tono);       
        triada[2]=Intervals.upDiatonic(triada[0], 4, tono);
    }
    public Note[] getAcorde(){
        return triada;
    }
    
    
    public void invertir(int inversion){}
}
