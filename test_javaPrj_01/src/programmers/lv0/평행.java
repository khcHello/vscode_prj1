package src.programmers.lv0;

public class 평행 {

    private 평행(){}

    @SuppressWarnings("unused")
    public void Solution() throws Exception{
        
        // 기울기
        // y증가량 / x증가량

        // int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {6, 11}};

        int[] x = dots[0];
        int[] y = dots[1];
        int[] a = dots[2];
        int[] b = dots[3];

        boolean result = (double)Math.abs(a[1] - b[1]) / (double)Math.abs(a[0] - b[0]) == (double)Math.abs(x[1] - y[1]) / (double)Math.abs(x[0] - y[0]);

        // return result ? 1 : 0;
    }

    



    public static void main(String[] args) {
        
        try{
            new 평행().Solution();

        }catch(Exception e){
            e.printStackTrace();
        }


    }
}


