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
public class Cuatriada implements Acorde{
    
    private Note cuatriada[]=new Note[4];
    
    public Cuatriada(int grado, Key tono){
        cuatriada[0]=tono.escala[grado];
        cuatriada[1]=tono.escala[(grado+2)%7];
        cuatriada[2]=tono.escala[(grado+4)%7];
        cuatriada[3]=tono.escala[(grado+6)%7];
    }
    public Note[] getCuatriada(){
        return cuatriada;
    }
}
