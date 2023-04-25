package programmers.lv0;

public class 주사위의개수 {
    
    private 주사위의개수(){
        try{
            Solution();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void Solution() throws Exception{
        int[] box = {10, 8, 6};
        int n = 3;
        
        System.out.println((int)(Math.floor(box[0]/n) * Math.floor(box[1]/n) * Math.floor(box[2]/n)));
    }

    public static void main(String[] args) {
        new 주사위의개수();
    }


}
