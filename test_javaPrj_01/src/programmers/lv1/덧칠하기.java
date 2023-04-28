package programmers.lv1;

public class 덧칠하기 {

    private 덧칠하기(){}

    public void Solution() throws Exception{

        // int n = 8;
        // int m = 4;
        // int[] section = {2,3,6};

        // int n = 8;
        int m = 4;
        int[] section = {1,3};

        int lastPaintedZone = -1*m;
        int paintCount = 0;
        for(int i = 0; i < section.length; i++){
            
            int zone = section[i];
            System.out.println(lastPaintedZone+m + " : " + zone);
            
            if(lastPaintedZone+m < zone+1){
                
                lastPaintedZone = zone;
                paintCount++;
            }

        }
        System.out.println(paintCount);


    }



    public static void main(String[] args) {
        
        try{
            new 덧칠하기().Solution();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
