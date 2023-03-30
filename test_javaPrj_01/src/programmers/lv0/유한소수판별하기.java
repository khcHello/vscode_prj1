package src.programmers.lv0;

public class 유한소수판별하기 {
    
    private 유한소수판별하기(){}


    public void Solution() throws Exception{
        
        int a = 12;
        int b = 21;

        int greatestCommonDivisor = getTheGreatestCommonDivisor(a, b);
        
        int reduceDenominator = b/greatestCommonDivisor; 
        
        int answer = 1;
        int dividor = 2;
        while( reduceDenominator > 1 ){
            if(reduceDenominator%dividor == 0){
                if(!(dividor == 2 || dividor == 5)){
                    answer = 2;
                    break;
                }
                reduceDenominator /= dividor;
            }else{
                dividor++;
            }
        }
        System.out.println(answer);
        
        // return answer;

    }


    public int getTheGreatestCommonDivisor(int numerator, int denominator){

        while(denominator != 0){
            int remain = numerator % denominator;
            numerator = denominator;
            denominator = remain;
        }

        return numerator;
    }

    



    public static void main(String[] args) {
        
        try{
            new 유한소수판별하기().Solution();

        }catch(Exception e){
            e.printStackTrace();
        }


    }


}
