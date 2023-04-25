package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 추억점수 {

    private 추억점수(){}

    public void Solution() throws Exception{
        
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        Map<String,Integer> peopleHash = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            peopleHash.put(name[i], yearning[i]);
        }
        
        int[] scoreArr = new int[photo.length];
        for(int i = 0; i < photo.length; i++){

            int totalScore = 0;
            for(int j = 0; j < photo[i].length; j++){
                if(peopleHash.get(photo[i][j]) != null){
                    totalScore += peopleHash.get(photo[i][j]);
                }
            }

            scoreArr[i] = totalScore;
        }
        
        System.out.println(Arrays.toString(scoreArr));
    }


    public static void main(String[] args) {
        
        try{
            new 추억점수().Solution();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
