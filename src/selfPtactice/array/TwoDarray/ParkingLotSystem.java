package selfPtactice.array.TwoDarray;

public class ParkingLotSystem {
    public static void main(String[] args) {


        int[][] parking = {
                {0, 0, 1, 1},  // Level 0 → 2 empty
                {1, 0, 0, 1},  // Level 1 → 2 empty
                {1, 1, 0, 1}   // Level 2 → 1 empty
        };
        int[] spots = new int[parking.length];
        int check = -1;
        int checkIndex = -1;
        for (int i = 0; i < parking.length; i++) {
            int zeroCount = 0;
            for (int j = 0; j < parking[i].length; j++) {
                if (parking[i][j] == 0) {
                    zeroCount++;
                }
            }
            spots[i] = zeroCount;
        }



        for (int i = 0; i < spots.length; i++) {
            if (spots[i] > check) {  // picks last level with max empty spots
                check = spots[i];
                checkIndex = i;
            }
        }
        System.out.println("The level with most parking space is:  Level-" + checkIndex);

    }
}
