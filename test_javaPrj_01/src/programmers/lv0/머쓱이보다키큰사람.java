package src.programmers.lv0;

import java.util.Arrays;

public class 머쓱이보다키큰사람 {

    private 머쓱이보다키큰사람(){}


    public void Solution() throws Exception{

        int[] array= {149, 180, 192, 170};

        int height = 167;
        
        System.out.println((int)Arrays.stream(array).filter(o -> o > height).count());
        

    }

    public static void main(String[] args) {
        
        try{
            new 머쓱이보다키큰사람().Solution();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
