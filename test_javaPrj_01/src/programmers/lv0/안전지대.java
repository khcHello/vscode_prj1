package src.programmers.lv0;

import java.util.Arrays;

public class 안전지대 {
    
    private 안전지대(){
        try{
            Solution();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public void Solution() throws Exception{
        
        // int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 1}, {0, 0, 0, 0, 1}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        // int[][] board = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};

        // for()

        //정사각형
        int idxI = 0;
        for(int[] mineField : board){

            int idxJ = 0;
            for(int area : mineField){

                if(area == 1){

                    //윗 변
                    if(idxI > 0){
                        //왼
                        if(idxJ > 0){
                            board[idxI-1][idxJ-1] = 2;
                        }

                        //중
                        board[idxI-1][idxJ] = 2;

                        //오
                        if(idxJ < mineField.length-1){
                            board[idxI-1][idxJ+1] = 2;
                        }

                    }

                    //중앙 변
                    //왼
                    if(idxJ > 0){
                        mineField[idxJ-1] = 2;
                    }

                    //중
                    mineField[idxJ] = 2;

                    //오
                    if(idxJ < mineField.length-1){
                        mineField[idxJ+1] = mineField[idxJ+1] == 1 ? 1 : 2;
                    }


                    //아랫 변
                    if(idxI < board.length-1){
                        //왼
                        if(idxJ > 0){
                            board[idxI+1][idxJ-1] = board[idxI+1][idxJ-1] == 1 ? 1 : 2;
                        }

                        //중
                        board[idxI+1][idxJ] = board[idxI+1][idxJ] == 1 ? 1 : 2;

                        //오
                        if(idxJ < mineField.length-1){
                            board[idxI+1][idxJ+1] = board[idxI+1][idxJ+1] == 1 ? 1 : 2;
                        }
                    }
                }

                idxJ++;
            }

            idxI++;
        }

        for(int[] a : board){
            System.out.println(Arrays.toString(a));
        }

        Arrays.stream(board).flatMapToInt(Arrays::stream).filter(area -> area == 0).count();
        // return Arrays.stream(board).flatMapToInt(Arrays::stream).filter(area -> area == 0).count();
        System.out.println((int)Arrays.stream(board).flatMapToInt(Arrays::stream).filter(area -> area == 0).count());

    }

    public int[] checkSafety(int[] field, int[] mine){

        //-6 -5 -4 -1 0 +1 +4 +5 +6


        return null;
    }

    public static void main(String[] args) {
        new 안전지대();
    }

}
