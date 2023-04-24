package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {

    private 달리기경주(){}

    public void Solution() throws Exception{
        
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        // String[] callings = {"kai", "kai"};

        Map<String, Integer> playerHash = new HashMap<>();
        int i = 0;
        for(String player: players){
            playerHash.put(player, i++);
        }

        for(String call: callings){
            int foreIdx = playerHash.get(call);

            playerHash.put(players[foreIdx-1], foreIdx);
            playerHash.put(players[foreIdx], foreIdx-1);
            players[foreIdx] = players[foreIdx-1];
            players[foreIdx-1] = call;
            
        }
        
        System.out.println(Arrays.toString(players));
        
    }


    public static void main(String[] args) {
        
        try{
            new 달리기경주().Solution();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
