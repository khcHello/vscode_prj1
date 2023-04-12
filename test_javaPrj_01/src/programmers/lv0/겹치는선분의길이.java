package src.programmers.lv0;

import java.util.Arrays;

public class 겹치는선분의길이 {
    
    private 겹치는선분의길이(){}

    public void Solution() throws Exception{
        
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        // int[][] lines = {{0, 5}, {3, 9}, {1, 10}};

        int maxVal = Arrays.stream(lines).flatMapToInt(line -> Arrays.stream(line)).max().getAsInt();
        int minVal = Arrays.stream(lines).flatMapToInt(line -> Arrays.stream(line)).min().getAsInt();
        
        int[] firstLine = lines[0];
        int[] secondLine = lines[1];
        int[] thirdLine = lines[2];

        int answer = 0;
        for(int i = minVal; i < maxVal; i++){
            int parallelCount = 0;

            if(firstLine[0] <= i && i < firstLine[1]){
                parallelCount++;
            }

            if(secondLine[0] <= i && i < secondLine[1]){
                parallelCount++;
            }

            if(thirdLine[0] <= i && i < thirdLine[1]){
                parallelCount++;
            }

            if(parallelCount > 1){
                answer++;
            }
        }

        System.out.println(answer);

        // String[][] namesArray = new String[][]{
        //     {"kim", "taeng"}, {"mad", "play"},
        //     {"kim", "mad"}, {"taeng", "play"}};
    
        // Set<String> namesWithFlatMap = Arrays.stream(namesArray)
        //         .flatMap(innerArray -> Arrays.stream(innerArray)).fi;


    }


    public static void main(String[] args) {
        
        try{
            new 겹치는선분의길이().Solution();

        }catch(Exception e){
            e.printStackTrace();
        }

    }


}
