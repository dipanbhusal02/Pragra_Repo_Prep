package selfPtactice.array.TwoDarray;

public class ParkingLotBiggestRectangle {
    public static void main(String[] args) {
        int[][] parking = {
                {0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0}
        };
        int [] histogram =  new int[parking[0].length];
        int maxArea =0;
        int maxAreaIndexColumn=0;
        int maxAreaIndexRow=0;

        for(int i = 0; i<parking.length; i++){


            for(int j=0; j<parking[0].length; j++){
                if(parking[i][j]==0){
                    histogram[j]= histogram[j]+1;
                }
                else {
                    histogram[j]=0;
                }

            }


        for (int l= 0; l<histogram.length; l++){
            int height = histogram[l];
            for(int k= l; k>=0; k--){
                if (histogram[k]==0) break;
                if (histogram[k]<height) height = histogram[k];
                int area = height * (l-k+1);
                if (area>maxArea){
                    maxArea=area;
                    maxAreaIndexColumn = l;
                    maxAreaIndexRow= i;

                }
            }

        }
        }
        System.out.println("\nThe biggest rectangle has teh area of "+maxArea+".");
        System.out.println("The max area index starts with: ["+ maxAreaIndexRow +"]"+ "["+maxAreaIndexColumn +"] .");

    }

}
