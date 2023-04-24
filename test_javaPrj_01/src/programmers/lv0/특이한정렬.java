package programmers.lv0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 특이한정렬 {

    private 특이한정렬(){}

    public void Solution() throws Exception{
        
        int[] numlist = {1, 2, 3, 4, 5, 6};
        int n = 4;

        List<UnusualSortObj> list = new ArrayList<>();
        for(int num : numlist){
            UnusualSortObj newObj = null;

            if(num > n){
                newObj = new UnusualSortObj(num, Math.abs((num - n)*2) );
            }else{
                newObj = new UnusualSortObj(num, Math.abs((num - n)*2) + 1 );
            }
            
            list.add(newObj);
        }
        
        Collections.sort(list);

        // for(UnusualSortObj obj : list){
        //     System.out.println(obj.getIdNumber());
        // }
        // return list.stream().mapToInt(obj -> obj.getIdNumber()).toArray();

    }

    public class UnusualSortObj implements Comparable<UnusualSortObj>{

        private int idNumber;
        private int distance;

        public UnusualSortObj(int idNumber, int distance){
            this.idNumber = idNumber;
            this.distance = distance;
        }

        public int getIdNumber() {
            return this.idNumber;
        }

        public void setIdNumber(int idNumber) {
            this.idNumber = idNumber;
        }

        public int getDistance() {
            return this.distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        @Override
        public int compareTo(UnusualSortObj o) {
            if (this.distance > o.distance) {
                return 1;
            }
            if (this.distance < o.distance) {
                return -1;
            }
            return 0;
        }

    }

    public static void main(String[] args) {
        
        try{

            new 특이한정렬().Solution();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
