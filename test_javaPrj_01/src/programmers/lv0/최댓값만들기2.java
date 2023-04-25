package programmers.lv0;

public class 최댓값만들기2 {
    private 최댓값만들기2(){
        try{
            Solution();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void Solution() throws Exception{

        // System.out.println(-10*10);
        int[] numbers = {0, -31, 24, 10, 1, 9};
        // int[] numbers = {2, 4, 5, 7};


        int maximum = -100000000;
        int idxI = 1;
        for(int element : numbers){

            for(int i = idxI; i < numbers.length; i++){
                System.out.println(element+"*"+numbers[i] +" = "+ element*numbers[i]);
                maximum = element*numbers[i] > maximum ? element*numbers[i] : maximum;
            }
            idxI++;
        }

        System.out.println(maximum);
    }

    public static void main(String[] args) {
        new 최댓값만들기2();
    }
}
