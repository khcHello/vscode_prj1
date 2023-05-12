package programmers.lv1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 카드뭉치 {

    private 카드뭉치(){}

    public void Solution() throws Exception{

        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        Queue<String> cardQueue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> cardQueue2 = new LinkedList<>(Arrays.asList(cards2));
        Queue<String> goalQueue = new LinkedList<>(Arrays.asList(goal));


        String result = "Yes";
        while(goalQueue.size() > 0){
            
            if(goalQueue.peek().equals(cardQueue1.peek())){
                cardQueue1.remove();
                goalQueue.remove();
                continue;
            }

            if(goalQueue.peek().equals(cardQueue2.peek())){
                cardQueue2.remove();
                goalQueue.remove();
                continue;
            }
            
            result = "No";
            break;
        }

        System.out.println(result);
        


    }


    public static void main(String[] args) {
        
        try{
            new 카드뭉치().Solution();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
