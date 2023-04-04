package src.programmers.lv0;

public class 컨트롤제트 {
    
    private 컨트롤제트(){
        try{
            Solution();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public void Solution() throws Exception{

        // String s = "1 2 Z 3";
        String s = "10 20 30 40";

        int result = 0;
        int minusVar = 0;
        for(String str : s.split(" ")){

            result = "Z".equals(str) ? result - minusVar : result + Integer.valueOf(str);
            minusVar = "Z".equals(str) ? 0 : Integer.valueOf(str);
        }

        System.out.println(result);

    }


    public static void main(String[] args) {
        new 컨트롤제트();
    }


}
