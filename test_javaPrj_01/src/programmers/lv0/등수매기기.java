package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 등수매기기 {

    private 등수매기기(){}


    public void Solution() throws Exception{

        // int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        // int[][] score = {{10, 10}, {20, 20}, {15, 15}, {15, 15}};

        List<Student> studentList = new ArrayList<>();
        for(int[] scoreArr : score){

            Student s = new Student(scoreArr[0] + scoreArr[1]);
            
            studentList.add(s);
            for(Student compareS : studentList){
                
                if(compareS.equals(s)){
                    break;
                }

                if(s.getTotalScore() > compareS.getTotalScore()){
                    compareS.setRank(compareS.getRank() + 1);

                }else if(s.getTotalScore() == compareS.getTotalScore()){
                    //do nothing
                }else{
                    s.setRank(s.getRank() + 1);
                }
            }
            
        }

        System.out.println( Arrays.toString(studentList.stream().mapToInt( obj -> obj.getRank() ).toArray()) );

    }



    public class Student{

        private int rank;
        private int totalScore;

        public Student(int totalScore){
            rank = 1;
            this.totalScore = totalScore;
        }

        public int getRank() {
            return this.rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public int getTotalScore() {
            return this.totalScore;
        }

        public void setTotalScore(int totalScore) {
            this.totalScore = totalScore;
        }

    }





    public static void main(String[] args) {
        
        try{

            new 등수매기기().Solution();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
