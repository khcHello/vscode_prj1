package src.programmers.lv0;

public class 숨어있는숫자의덧셈2 {
    private 숨어있는숫자의덧셈2(){
        try{
            Solution();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public void Solution() throws Exception{
        
        String my_string = "aAb1B2cC34oOp";



        String regex = "[a-zA-Z]";
        String[] array = my_string.replaceAll(regex, ":").split(":");

        int answer = 0;
        for(String element : array){
            if(element.length() > 0){
                answer += Integer.valueOf(element);
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {
        new 숨어있는숫자의덧셈2();
    }
}
