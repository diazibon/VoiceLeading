/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voice.leading;

import java.util.LinkedHashMap;
import java.util.Map;

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
        Map<String,Integer> Cromatica = new LinkedHashMap<>();
        Cromatica.put("C",1);
        Cromatica.put("C#",2);
        Cromatica.put("Db",2);
        Cromatica.put("D",3);
        Cromatica.put("D#",4);
        Cromatica.put("Eb",4);
        Cromatica.put("E",5);
        Cromatica.put("F",6);
        Cromatica.put("F#",7);
        Cromatica.put("Gb",7);
        Cromatica.put("G",8);
        Cromatica.put("G#",9);
        Cromatica.put("Ab",9);
        Cromatica.put("A",10);
        Cromatica.put("A#",11);
        Cromatica.put("Bb",11);
        Cromatica.put("B",12);
        
        String Tonica;
        
        for (Map.Entry<String,Integer> entry: Cromatica.entrySet()){
            Tonality X = new Tonality (entry.getKey());
            int x=0;
            while (x<=6){
                System.out.println(X.Mode(x));
                x++;
                int y=0;
                while (y<=6){
                    System.out.println(X.Chord(y));
                    y++;
                 }
            }
        }
        
    }

}

