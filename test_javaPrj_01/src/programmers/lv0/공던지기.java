package programmers.lv0;

public class 공던지기 {

    private 공던지기(){}

    public void Solution() throws Exception{

        int[] numbers = {1, 2, 3};
        int k = 6;

        //1 + 2(k-1)
        //numbers.length

        // (1 + 2*(k-1)) 
        // (1 + 2*(k-1)) % numbers.length 
        System.out.println( (1 + 2*(k-1)) % numbers.length == 0 ? numbers[numbers.length-1] : (1 + 2*(k-1)) % numbers.length );

        
    }

    public static void main(String[] args) {
        
        try{
            new 공던지기().Solution();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
