package programmers.lv0;

public class 삼각형의완성조건2 {
    
    private 삼각형의완성조건2(){
        try{
            Solution();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public void Solution() throws Exception{
        
        int[] sides = {3,6};
        
        int x = sides[0] > sides[1] ? sides[0] : sides[1];
        int y = sides[0] >= sides[1] ? sides[1] : sides[0];
        int z = x;

        int triangleCnt = 0;
        for(int i = x; i != 0; i--){
            if((i+y) > x){
                triangleCnt++;
            }
        }

        while(true){
            
            if((x+y) <= ++z){
                break;
            }
            triangleCnt++;
        }
        // return triangleCnt;
        // return Math.min(sides[0], sides[1]) * 2 - 1;

    }

    public static void main(String[] args) {
        new 삼각형의완성조건2();
    }

}
