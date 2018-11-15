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
        /*cuatriada[0]=tono.escala[grado];
        if (grado+2>=7){
            cuatriada[1].setOctava(cuatriada[0].getOctava()+1);
        }
        cuatriada[1]=tono.escala[(grado+2)%7];
        cuatriada[2]=tono.escala[(grado+4)%7];
        cuatriada[3]=tono.escala[(grado+6)%7];*/
        cuatriada[0]=tono.escala[grado];
        cuatriada[1]=Intervals.upDiatonic(cuatriada[0], 2, tono);       
        cuatriada[2]=Intervals.upDiatonic(cuatriada[0], 4, tono);
        cuatriada[3]=Intervals.upDiatonic(cuatriada[0], 6, tono);
    }
    public Note[] getAcorde(){
        return cuatriada;
    }
}
