package src.programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

import src.test;

public class 외계어사전 {
    
    public void Solution() throws Exception{
        

        // String[] spell = {"p", "o", "s"};
        // String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};

        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};

        String test = ""+Arrays.stream(spell).collect(Collectors.joining("|"))+"";
        
        for(String word : dic){

            

            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        
        try{
            new 외계어사전().Solution();

        }catch(Exception e){
            e.printStackTrace();
        }


    }

}
