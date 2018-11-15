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
public class KeyMinor extends Key {
    private String mode;
    
    public KeyMinor(String tono){
        super(tono);
        Note.rebajar(escala[2]);
        Note.rebajar(escala[5]);
        Note.rebajar(escala[6]);
        
    }
    public KeyMinor(String tono,String mode){
        super(tono);
        Note.rebajar(escala[2]);
        Note.rebajar(escala[5]);
        Note.rebajar(escala[6]);        
        if (mode.equals("Harmonic")){
            Note.sostener(escala[6]);
        }
        if (mode.equals("Melodic")){
            Note.sostener(escala[5]);
            Note.sostener(escala[6]);
        }
        
    }
}
