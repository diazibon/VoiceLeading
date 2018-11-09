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
        triada[0]=tono.escala[(grado%7)];
        triada[1]=tono.escala[(grado+2)%7];
        triada[2]=tono.escala[(grado+4)%7];
    }
    public Note[] getTriada(){
        return triada;
    }
    
    
    public void invertir(int inversion){}
}
