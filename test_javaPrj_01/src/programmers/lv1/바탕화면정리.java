package programmers.lv1;

public class 바탕화면정리 {

    private 바탕화면정리(){}

    public void Solution() throws Exception{
        
        String[] wallpaper = {"...#"};

        int startX = wallpaper.length > 0 ? wallpaper[0].length() : 0;
        int startY = -1;
        int endX = -1;
        int endY = -1;

        
        for(int i = 0; i < wallpaper.length; i++){

            String block = wallpaper[i];

            if(startX > block.indexOf("#") && block.indexOf("#") != -1){
                startX = block.indexOf("#");
            }

            if(startY == -1 && block.indexOf("#") > -1){
                startY = i;
            }
            
            if(endX < block.lastIndexOf("#")){
                endX = block.lastIndexOf("#");
            }

            if(endY < i && block.indexOf("#") > -1){
                endY = i;
            }
        }

        // System.out.println("sX : "+startX+", sY : "+startY+", eX : "+endX+", eY : "+endY);
        System.out.println("sY : "+startY+", sX : "+startX+", eY : "+(endY+1)+", eX : "+(endX+1));
        // System.out.println(Arrays.toString(new int[]{startY, startX, endY+1, endX+1}));

    }



    public static void main(String[] args) {
        
        try{
            new 바탕화면정리().Solution();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
