package src.programmers.lv0;

import java.util.Arrays;

public class 이차원으로만들기 {

    private 이차원으로만들기(){}


    public void Solution() throws Exception{

        // int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        // int n = 2;

        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n = 3;

        int[][] answer = new int[num_list.length/n][n];
        
        
        for(int i = 0; i < num_list.length/n; i++){
            
            int[] tempArr = new int[n];
            for(int j = 0; j < tempArr.length; j++){
                System.out.println("n : "+n+", i : "+i +", j : "+j);        
                tempArr[j] = num_list[(n*i)+j];
            }
            answer[i] = tempArr;
        }

        for(int[] a : answer){
            System.out.println(Arrays.toString(a));
        }

    }

    public static void main(String[] args) {
        
        try{
            new 이차원으로만들기().Solution();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
