package src.programmers.lv0;

import java.util.LinkedHashSet;
import java.util.Set;

public class 소인수분해 {
    
    private 소인수분해(){
        try{
            Solution();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public void Solution() throws Exception{

        int n = 12;

        int i = 0;
        Set<Integer> resultList = new LinkedHashSet<>();
        int dividor = 2;
        while(n > 1){
            
            if(n % dividor == 0){
                n /= dividor;
                
                resultList.add(dividor);
            }else{
                dividor++;
            }
        }
        
        resultList.stream().mapToInt(obj -> obj).toArray();
    }


    public static void main(String[] args) {
        new 소인수분해();
    }


}
