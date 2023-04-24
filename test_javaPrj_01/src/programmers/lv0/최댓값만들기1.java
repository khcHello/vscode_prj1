package programmers.lv0;

public class 최댓값만들기1 {
    
    private 최댓값만들기1(){
        try{
            Solution();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public void Solution() throws Exception{
        int[] numbers = new int[]{1, 5, 2, 4, 6, 5};


        Integer[] maxAndFriend = new Integer[2];

        for(int number : numbers){
            
            if(maxAndFriend[0] == null){
                System.out.println("초기화됨 : "+number);
                maxAndFriend[0] = number;
                continue;
            }else if(maxAndFriend[1] == null){

                if(maxAndFriend[0] < number){
                    maxAndFriend[1] = maxAndFriend[0];
                    maxAndFriend[0] = number;
                }else{
                    maxAndFriend[1] = number;
                }

                continue;
            }

            if(maxAndFriend[0] < number){
                maxAndFriend[1] = maxAndFriend[0];
                maxAndFriend[0] = number;
            }else if(maxAndFriend[1] < number){
                maxAndFriend[1] = number;
            }

        }

        System.out.println(maxAndFriend[0] + " * " + maxAndFriend[1] + " = " + (maxAndFriend[0]*maxAndFriend[1] ) );

    }


    public static void main(String[] args) {
        new 최댓값만들기1();
    }


}
