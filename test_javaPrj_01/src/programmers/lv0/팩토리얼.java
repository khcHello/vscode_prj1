package programmers.lv0;

public class 팩토리얼 {
    
    private 팩토리얼(){
        try{
            Solution();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public void Solution() throws Exception{

        int n = 7;

        int factorialValue = 1;

        Factorial facLast = new Factorial();
        Factorial facPrevious = new Factorial();

        for(int i = 1; factorialValue-1 < n; i++){

            facPrevious.setFactorial(i - 1);
            facPrevious.setIntValue(factorialValue);

            factorialValue *= i;
            facLast.setFactorial(i);
            facLast.setIntValue(factorialValue);
        }
       
        System.out.println(facPrevious);
        System.out.println(facLast);

        //
        int test = facLast.getIntValue() > n ? facPrevious.getFactorial() : facLast.getFactorial();
        
        System.out.println(test);
    }

    class Factorial{
        private int factorial;
        private int intValue;

        private Factorial(){

        }

        public int getFactorial() {
            return this.factorial;
        }

        public void setFactorial(int factorial) {
            this.factorial = factorial;
        }

        public int getIntValue() {
            return this.intValue;
        }

        public void setIntValue(int intValue) {
            this.intValue = intValue;
        }

        @Override
        public String toString() {
            return this.factorial + " : "+this.intValue;
        }
    }

    public static void main(String[] args) {
        new 팩토리얼();
    }


}
