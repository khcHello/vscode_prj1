package src.programmers.lv0;

import java.util.Arrays;

public class 숨어있는숫자의덧셈1 {
    
    private 숨어있는숫자의덧셈1(){
        try{
            Solution();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public void Solution() throws Exception{

        String my_string = "aAb1B2cC34oOp";

        String[] strArr = my_string.replaceAll("[a-zA-Z]", "").split("");

        System.out.println(Arrays.toString(strArr));

        System.out.println(Arrays.stream(my_string.replaceAll("[a-zA-Z]", "").split("")).mapToInt(obj -> Integer.valueOf(obj)).sum() );


    }


    public static void main(String[] args) {
        new 숨어있는숫자의덧셈1();
    }


}
