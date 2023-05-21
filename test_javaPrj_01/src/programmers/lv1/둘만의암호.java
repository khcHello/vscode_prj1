package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class 둘만의암호 {

    private 둘만의암호(){}

    public void Solution() throws Exception{
        String s = "aukks";
        String skip = "wbqd";
        int index = 3;
        
        // Set<Integer> skipSet = skip.chars().mapToObj(c->Character.hashCode((char)c)).collect(Collectors.toSet());
        //a : 97
        //z : 122

        Set<Integer> skipSet = skip.chars().mapToObj(c->Character.hashCode((char)c)).collect(Collectors.toSet());
        List<Integer> skipList = new ArrayList<>(skipSet);
        Collections.sort(skipList);

        System.out.println(skipHash('a', index, skip));

    }

    //특정 문자의 인덱스만큼 스킵하며, 더한 문자를 반환함
    public char skipHash(char charater, int index, String skipStr){

        Set<Integer> skipSet = skipStr.chars().mapToObj(c->Character.hashCode((char)c)).collect(Collectors.toSet());
        List<Integer> skipList = new ArrayList<>(skipSet);
        Collections.sort(skipList);
        
        int cnt = index;
        
        for(int i = 0; i < skipList.size(); i++){
            System.out.println("Processing : skip = "+skipList.get(i)+", charHash : "+Character.hashCode(charater));
            if(Character.hashCode(charater) < skipList.get(i) && skipList.get(i) < Character.hashCode(charater)+cnt){
                cnt++;
            }else{
                break;
            }
        }

        System.out.println(cnt);
        System.out.println(index);
        return (char)(Character.hashCode(charater)+cnt);
    }


    public static void main(String[] args) {
        
        try{
            new 둘만의암호().Solution();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
