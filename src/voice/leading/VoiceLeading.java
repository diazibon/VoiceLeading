/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voice.leading;

/**
 *
 * @author Ibon
 * 
 */


public class VoiceLeading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
        
        /*for(int x=0;x<7;x++){
        Acorde a=gestionarAcorde.crearAcorde("CUATRIADA",x,new KeyMinor("Eb","Melodic"));
        Note[] b=a.getAcorde();
        mostrarConjunto.mostrar(b);
        }*/
        
        Key Tono=new KeyMinor("Ab","Harmonic");
        Tono.setMode(4);
        
        Acorde Chord=gestionarAcorde.crearAcorde("TRIADA", 1, Tono);
        mostrarConjunto.mostrar(Chord.getAcorde());
        //NewJFrame nP = new NewJFrame();
        //nP.setVisible(true);
        
    }
}