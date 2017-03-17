/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voice.leading;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Ibon
 */

public class Tonality {
    private Map<String, Integer> Scale = new LinkedHashMap<>();
    private Map<String, Integer> Chord;
    private Map<String, Integer> Mode = new LinkedHashMap<>();
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
        
        int i=0;
        System.out.println(i);
        for (Map.Entry<String,Integer> entry : Quintas.entrySet()){
            if (entry.getKey().equals(Tonic)){
                i=entry.getValue()-1;
            }
        }     
        
            
        int j;
        j=i+6;
        int k;
        k=3;
        while (i<=j){
            for (Map.Entry<String,Integer> entry : Quintas.entrySet()){
                    if (entry.getValue()==i){
                            Scale.put(entry.getKey(), (i-i+k)%7);
                    }
            }
        i=i+1;
        k=k+4;
        }
        
        System.out.println(Scale);
        
    }
    public Map<String,Integer> Mode(int grado){
        Mode.putAll(Scale);
        for (Map.Entry<String,Integer> entry : Mode.entrySet()){
            entry.setValue((entry.getValue()+7-grado)%7);
        }
        return Mode;
    }
    public Map<String,Integer> Chord(int grado){
        Chord = new LinkedHashMap<>();
        for (Map.Entry<String,Integer> entry : Mode.entrySet()){
            if (entry.getValue()==grado){
                Chord.put(entry.getKey(),0);
            }
                else if (entry.getValue()==(grado+2)%7){
                    Chord.put(entry.getKey(), 2);                
                    }
                else if (entry.getValue()==(grado+4)%7){
                    Chord.put(entry.getKey(),4);
                }    
        }
        return Chord;
    }

    /**
     * @return the Scale
     */
    public Map<String, Integer> getScale() {
        return Scale;
    }
    
}
