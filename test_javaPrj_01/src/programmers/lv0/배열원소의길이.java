package programmers.lv0;

import java.util.Arrays;

public class 배열원소의길이 {
    
    private 배열원소의길이(){
        try{
            Solution();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public void Solution() throws Exception{

        String[] strlist = {"We", "are", "the", "world!"};

        int[] list = Arrays.stream(strlist).mapToInt(str -> str.length()).toArray();

        System.out.println(Arrays.toString(list));

    }


    public static void main(String[] args) {
        new 배열원소의길이();
    }


}
