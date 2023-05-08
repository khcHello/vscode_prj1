package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class 대충만든자판 {

    private 대충만든자판(){}

    public void Solution() throws Exception{

        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};

        // String[] keymap = {"AA"};
        // String[] targets = {"B"};

        KeyBoard board = new KeyBoard();
        for(String element : keymap){
            board.arrangeKey(element);
        }

        System.out.println(board.toString());

        int[] answer = new int[targets.length];
        int i = 0;
        for(String target : targets){
            answer[i++] = board.getKeywordIdx(target);
            // System.out.println(board.getKeywordIdx(target));
        }

        System.out.println(Arrays.toString(answer));
    }

    class KeyBoard{

        private Map<String, Integer> keyMap;

        private KeyBoard(){
            keyMap = new HashMap<String, Integer>();
        }

        public void arrangeKey(String singleKey){

            int i = 0;
            for(String character : singleKey.split("")){
                i++;

                if(keyMap.containsKey(character)){
                    if(keyMap.get(character) > i){
                        keyMap.put(character, i);
                    }
                }else{
                    keyMap.put(character, i);
                }
            }
        }

        public int getKeywordIdx(String target){
            
            int totalInputCnt = 0;
            for(String character : target.split("")){

                if(!keyMap.containsKey(character)){
                    return -1;
                }else{
                    totalInputCnt += keyMap.get(character);
                }
            }

            return totalInputCnt;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();

            for(Entry<String,Integer> ent : this.keyMap.entrySet()){
                builder.append(ent.getKey()).append(" : ").append(ent.getValue()).append("\n");
            }
            return builder.toString();
        }

    }


    public static void main(String[] args) {
        
        try{
            new 대충만든자판().Solution();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
