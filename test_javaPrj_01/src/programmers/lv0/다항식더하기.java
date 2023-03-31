package src.programmers.lv0;

public class 다항식더하기 {
    private 다항식더하기(){
        try{
            Solution();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public void Solution() throws Exception{

        String polynomial = "3x + 7 + x + 2";

        System.out.println(polynomial.replaceAll(" ", ""));
        String[] array = polynomial.replaceAll(" ", "").split("[+]");

        
        int monomial = 0;
        int constant = 0;
        for(String element : array){
            if(element.indexOf("x") > -1){
                String str = element.replaceAll("x", "");
                monomial += str.length() > 0 ? Integer.valueOf(str) : 1;
            }else{
                constant += Integer.valueOf(element);
            }
        }
        
        String answer = "";
        if(monomial > 0){
            answer += monomial > 1 ? monomial + "x" : "x";
        }
        if(constant > 0){
            if(answer.length() > 0){
                answer += " + ";
            }
            answer += constant;
        }
        System.out.println(answer);
        // return monomial+"x + "+constant;

    }

    public static void main(String[] args) {
        new 다항식더하기();
    }
}
