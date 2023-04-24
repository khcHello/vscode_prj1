package programmers.lv0;

public class 합성수찾기 {

    private 합성수찾기(){}


    public void Solution() throws Exception{

        int n = 15;

        //primenumber 소수
        //compositenumber 합성수

        int compositeNumberCnt = 0;
        for(int i = 4; i < n+1; i++){
            
            if(i % 2 == 0){
                compositeNumberCnt++;
                continue;
            }

            if(i % 3 == 0 || (i % 5 == 0 && i != 5) || (i % 7 == 0 && i != 7)){
                compositeNumberCnt++;
                continue;
            }

        }
        System.out.println(compositeNumberCnt);
        

    }

    public static void main(String[] args) {
        
        try{
            new 합성수찾기().Solution();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
