/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voice.leading;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ibon
 */

public class Tonality {
    public Tonality(String Tonic){
        
        Map<String,Integer> Quintas = new HashMap<>();
        Quintas.put("Cb", -7);
        Quintas.put("Gb", -6);
        Quintas.put("Db", -5);
        Quintas.put("Ab", -4);
        Quintas.put("Eb", -3);
        Quintas.put("Bb", -2);
        Quintas.put("F", -1);
        Quintas.put("C", 0);
        Quintas.put("G", 1);
        Quintas.put("D", 2);
        Quintas.put("A", 3);
        Quintas.put("E", 4);
        Quintas.put("B", 5);
        Quintas.put("F#", 6);
        Quintas.put("C#", 7);
        Quintas.put("G#", 8);
        Quintas.put("D#", 9);
        Quintas.put("A#", 10);
        Quintas.put("E#", 11);
        Quintas.put("B#", 12);
        
        Integer i=0;
        System.out.println(i);
        for (Map.Entry<String,Integer> entry : Quintas.entrySet()){
            if (entry.getKey().equals(Tonic)){
                i=entry.getValue()-1;
            }
        }     
        
        Map<String, Integer> Scale = new HashMap<>();    
        Integer j;
        j=i+6;
        while (i<=j){
            for (Map.Entry<String,Integer> entry : Quintas.entrySet()){
                    if (entry.getValue()==i){
                        Scale.put(entry.getKey(), i);
                    }
            }
        i=i+1;
        }
        
        System.out.println(Scale);
        
    }
    
}
