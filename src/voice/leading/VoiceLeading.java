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
        //Key GMayor=new KeyMajor("B");
        //mostrarConjunto.mostrar(GMayor.getEscala());
        //mostrarConjunto.mostrar(Key.getNotasAlteradas(Key.getAlteraciones("G")));
        //Cuatriada C=new Cuatriada(6, new KeyMajor("D"));
        //mostrarConjunto.mostrar(C.getTriada());
        Acorde a=gestionarAcorde.crearAcorde("CUATRIADA",4,new Key("F"));
        mostrarConjunto.mostrar(a.getCuatriada());
        
    }
}