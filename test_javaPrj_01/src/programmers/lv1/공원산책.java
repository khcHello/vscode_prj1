package programmers.lv1;

import java.util.Arrays;

public class 공원산책 {

    private 공원산책(){}

    public void Solution() throws Exception{
        String[] park = {"OOOXO", "OOOOO", "OOOSO", "OOOXO", "OOOXO", "OOOOO"};
        String[] routes = {"S 1"};

        String parkString = Arrays.toString(park).replaceAll("[^OSX]", "");
        
        int parkWidth = park[0].length();
        int parkHeight = park.length;

        String[] parkRotated = new String[parkWidth];
        Arrays.fill(parkRotated, "");
        for(int i = 0; i < parkString.length(); i++){
            parkRotated[i%parkWidth] += parkString.charAt(i);            
        }

        System.out.println(Arrays.toString(park));
        System.out.println(Arrays.toString(parkRotated));

        int startIdx = parkString.indexOf("S");
        int yStart = startIdx/park[0].length();
        int xStart = startIdx%park[0].length();
        Dog dog = new Dog(xStart, yStart);
        
        for(String route : routes){
            String direction = route.replaceAll("[0-9 ]", "");
            int distance = Integer.valueOf(route.replaceAll("[^0-9]", ""));

            if("E".equals(direction)){
                System.out.println(dog.getX()+distance > parkWidth-1);
                System.out.println("E : "+park[dog.getY()].substring(dog.getX()+1, dog.getX()+distance+1));
                if(dog.getX()+distance > parkWidth-1 || park[dog.getY()].substring(dog.getX()+1, dog.getX()+distance+1).indexOf("X") > -1){
                    continue;
                };
                dog.moveToEast(distance);
            }else if("W".equals(direction)){
                System.out.println(dog.getX()-distance < 0);
                System.out.println("W : "+park[dog.getY()].substring(dog.getX()-distance, dog.getX()));
                if(dog.getX()-distance < 0 || park[dog.getY()].substring(dog.getX()-distance, dog.getX()).indexOf("X") > -1){
                    continue;
                };
                dog.moveToWest(distance);
            }else if("N".equals(direction)){
                System.out.println(dog.getY()-distance < 0);
                System.out.println("N : "+parkRotated[dog.getX()].substring(dog.getY()-distance, dog.getY()));
                if(dog.getY()-distance < 0 || parkRotated[dog.getX()].substring(dog.getY()-distance, dog.getY()).indexOf("X") > -1 ){
                    continue;
                }
                dog.moveToNorth(distance);
            }else if("S".equals(direction)){
                System.out.println(dog.getY()+distance > parkHeight-1);
                System.out.println("S : "+parkRotated[dog.getX()].substring(dog.getY()+1, dog.getY()+distance+1));
                if(dog.getY()+distance > parkHeight-1 || parkRotated[dog.getX()].substring(dog.getY(), dog.getY()+distance).indexOf("X") > -1 ){
                    continue;
                }
                dog.moveToSouth(distance);
            }
        }

        System.out.println("Dog Location : "+dog.getX()+" : "+dog.getY());

    }

    class Dog{
        private int x;
        private int y;

        private Dog(int x, int y){
            this.x = x;
            this.y = y;
        }

        public void moveToNorth(int distance){
            this.y = this.y-distance;
        }
        public void moveToSouth(int distance){
            this.y = this.y+distance;
        }
        public void moveToEast(int distance){
            this.x = this.x+distance;
        }
        public void moveToWest(int distance){
            this.x = this.x-distance;
        }

        public int getX() {
            return this.x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return this.y;
        }

        public void setY(int y) {
            this.y = y;
        }

    }



    public static void main(String[] args) {
        
        try{
            new 공원산책().Solution();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
