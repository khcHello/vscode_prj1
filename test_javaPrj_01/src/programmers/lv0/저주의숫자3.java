package programmers.lv0;

public class 저주의숫자3 {
    
    private 저주의숫자3(){}

    public void Solution() throws Exception{

        int n = 40;

        int cursedCount = 0;
        for(int i = 1; i < n+1; i++){

            while(isCursed(i+cursedCount)){
                cursedCount++;
            }
        }
        
        //return n + cursedCount;


    }

    public boolean isCursed(int i){

        if(String.valueOf(i).indexOf("3") > -1 || i % 3 == 0){
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        
        try{
            new 저주의숫자3().Solution();

        }catch(Exception e){
            e.printStackTrace();
        }


    }

}
