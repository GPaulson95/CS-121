
public class MovieSimulationTwo {
    public static void main(String[] args) {
        //declaring
        int num [];
        num = new int [4]; //size

        int num2 [] = new int [5];

        for(int i = 0; i< num.length; i++) {
            // 0  1  2  3
            // 5  5   5  5
            num[i] = 5;
        }
        num[1] =6;
        String [] test ={"Test","test"};
        String name [];
        String [] movieNames = {"m1","m2","m3","m4","m5"};
        String [] movieTypes = {"2D","3D","2D","3D"};
        double [] moviePrice = {15.25,20.15,18.11,14.14};

        final int ROW = 5;
        final int COLUMN = 10;
        int[][] movieAvailability = new int [ROW][COLUMN];
        setSeatAvailability(movieAvailability);
        //display seat availability
        //randomGenerator
        //display seat availability


    }
    static void setSeatAvailability(int mAvail[][]){
        for (int i = 0; i < mAvail.length; i++){
            for(int j = 0; j < mAvail[i].length; j++){
                mAvail[i][j] = 0;
            }
        }
    }
}