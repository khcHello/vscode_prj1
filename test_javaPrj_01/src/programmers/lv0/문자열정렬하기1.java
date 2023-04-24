package programmers.lv0;

import java.util.Arrays;

public class 문자열정렬하기1 {
    
    private 문자열정렬하기1(){
        try{
            Solution();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public void Solution() throws Exception{

        String my_string = "hi12392";

        String[] arr = my_string.replaceAll("[a-zA-Z]", "").split("");
        Arrays.sort(arr);

        // return Arrays.stream(arr).mapToInt(obj -> Integer.valueOf(obj)).toArray();
        
        
        // System.out.println(String.join("", arr));

    }


    public static void main(String[] args) {
        new 문자열정렬하기1();
    }


}
