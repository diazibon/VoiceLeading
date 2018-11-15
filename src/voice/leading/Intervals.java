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
public class Intervals {
    public static Note upDiatonic(Note nota,int interval, Key tono){
        
        for (int x=0;x<tono.escala.length;x++){
            if (tono.escala[x].getNombre()==nota.getNombre()){
                return tono.escala[(x+interval)%7];
            }
        }
        return nota;
    }   
        
    
}
