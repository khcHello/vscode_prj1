package src.programmers.lv0;

public class 외계어사전 {
    
    private 외계어사전(){}

    @SuppressWarnings("unused")
    public void Solution() throws Exception{
        

        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};

        // String[] spell = {"z", "d", "x"};
        // String[] dic = {"def", "dww", "dzx", "loveaw"};

        // String test = "["+Arrays.stream(spell).collect(Collectors.joining("]{0,1}["))+"]{0,1}";
        

        
        // Pattern pattern = Pattern.compile(test);
        

        // System.out.println("regex : "+test);
        for(String word : dic){

            if(word.length() == spell.length){
                for(String replace : spell){
                    word = word.replaceFirst(replace, "");
                }
                if(word.length() == 0){
                    // return 1;
                }
            }
           
        }
        // return 2;
    }

    public static void main(String[] args) {
        
        try{
            new 외계어사전().Solution();

        }catch(Exception e){
            e.printStackTrace();
        }


    }

}
