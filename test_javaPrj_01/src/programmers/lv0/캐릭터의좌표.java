package programmers.lv0;

public class 캐릭터의좌표 {
    private 캐릭터의좌표(){
        try{
            Solution();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static int BOARD_SIZE_WIDTH = 0;
    public static int BOARD_SIZE_HEIGHT = 0;

    class Mussek{

        private int x;
        private int y;

        Mussek(){
            x = 0;
            y = 0;
        }

        public void upFunction(){
            setY(this.y + 1);
        }

        public void downFunction(){
            setY(this.y - 1);
        }

        public void leftFunction(){
            setX(this.x - 1);
        }

        public void rightFunction(){
            setX(this.x + 1);
        }
        
        public int getX() {
            return this.x;
        }

        public void setX(int x) {
            if(  (BOARD_SIZE_WIDTH + 1)/-2 < x && x < (BOARD_SIZE_WIDTH + 1)/2 ){
                this.x = x;
            }
        }

        public int getY() {
            return this.y;
        }

        public void setY(int y) {

            if(  (BOARD_SIZE_HEIGHT + 1)/-2 < y && y < (BOARD_SIZE_HEIGHT + 1)/2 ){
                this.y = y;
            }
        }

    }

    @SuppressWarnings("unused")
    public void Solution() throws Exception{

        // String[] keyinput = {"left", "right", "up", "right", "right"};
        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] board = {7, 9};

        BOARD_SIZE_WIDTH = board[0];
        BOARD_SIZE_HEIGHT = board[1];

        Mussek obj = new Mussek();

        for(String input : keyinput){
            if("left".equals(input)){
                obj.leftFunction();
            }else if("right".equals(input)){
                obj.rightFunction();
            }else if("up".equals(input)){
                obj.upFunction();
            }else if("down".equals(input)){
                obj.downFunction();
            }
        }

        // return {obj.getX(), obj.getY()};
        System.out.println(obj.getX() + " : "+obj.getY());
    }

    public static void main(String[] args) {
        new 캐릭터의좌표();
    }
}
