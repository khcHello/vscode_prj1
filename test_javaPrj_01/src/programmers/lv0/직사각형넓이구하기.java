package programmers.lv0;

import java.util.Arrays;

public class 직사각형넓이구하기 {
    
    private 직사각형넓이구하기(){
        try{
            Solution();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public void Solution() throws Exception{

        //밑변*높이
        // int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};

        int[] xCoordinate = Arrays.stream(dots).mapToInt(dot -> dot[0]).toArray();
        int[] yCoordinate = Arrays.stream(dots).mapToInt(dot -> dot[1]).toArray();

        int a = Math.abs(Arrays.stream(xCoordinate).max().getAsInt() - Arrays.stream(xCoordinate).min().getAsInt()) * Math.abs(Arrays.stream(yCoordinate).max().getAsInt() - Arrays.stream(yCoordinate).min().getAsInt());

        System.out.println(a);

    }


    public static void main(String[] args) {
        new 직사각형넓이구하기();
    }


}
