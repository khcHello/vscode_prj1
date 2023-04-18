package src.programmers.lv0;

import java.util.ArrayList;
import java.util.List;

public class 배열회전시키기 {

    private 배열회전시키기(){}


    public void Solution() throws Exception{

        // int[] numbers = {1, 2, 3};
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};

        String direction = "right";

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++){

            if("left".equals(direction)){
                if(i == numbers.length-1){
                    list.add(numbers[0]);
                }else{
                    list.add(numbers[i+1]);
                }
            }

            if("right".equals(direction)){
                if(i == 0){
                    list.add(numbers[numbers.length-1]);
                }else{
                    list.add(numbers[i-1]);
                }
            }
        }
        
        list.stream().mapToInt(o -> o).toArray();

        // List<Integer> list = new ArrayList<>();
        // for(int i = 0; i < numbers.length; i++){
        //     if(i == 0){

        //     }
        //     list.add(numbers[i]);
        //     if(i == numbers.length){

        //     }
        // }
        // System.out.println(Arrays.toString(answer));

    }

    public static void main(String[] args) {
        
        try{
            new 배열회전시키기().Solution();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
