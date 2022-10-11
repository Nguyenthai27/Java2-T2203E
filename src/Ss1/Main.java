package Ss1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("world");
        hs.add("hello");
        hs.add("world");
        for(String s:hs){
            System.out.println(s);
        }
    }
}
