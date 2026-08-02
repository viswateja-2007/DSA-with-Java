public class trapping_rain{
    public static int trappingRain(int arr[]){

        int min = 0;
        int trappedWater = 0;
        int width = 1;

        int n = arr.length;

        int left = arr[0];
        int right = arr[n - 1];

        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        for(int i = 0; i < n; i++){
            if(arr[i] >= left){
                left = arr[i];
                leftmax[i] = arr[i];
            }

            else{
                leftmax[i] = left;
            }
        }

        for(int i = n - 1; i >= 0; i--){
            if(arr[i] >= right){
                right = arr[i];
                rightmax[i] = arr[i];
            }

            else{
                rightmax[i] = right;
            }
        }


        for(int i = 0; i < n; i++){
            min = Math.min(leftmax[i], rightmax[i]);
            int water = (min - arr[i])*width;
            trappedWater += water;
        }

        return trappedWater;

    }


    public static void main(String args[]){
        int heigth[] = {4, 2, 0, 6, 3, 2, 5};

        int w = trappingRain(heigth);
        System.out.println("trapped water is : " + w);

    }
}
