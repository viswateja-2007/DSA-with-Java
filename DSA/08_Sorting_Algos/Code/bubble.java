public class bubble{

  public static int[] bubbleSort(int arr[]){
    int temp = 0;
    int n = arr.length;

    for(int i = 0; i < n - 1; i++){
      for(int j = 0; j < n - 1; j++){
        if(arr[j] > arr[j + 1]){
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    return arr;
  }


  public static int[] bubbleSortOpt(int arr[]){
    int temp = 0;
    int n = arr.length;

    for(int i = 0; i < n - 1; i++){
      for(int j = 0; j < n - 1 - i; j++){
        if(arr[j] > arr[j + 1]){
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    return arr;
  }
  public static void main(String args[]){

    int arr[] = {5, 4, 1, 3, 2};
    int temp[] = bubbleSort(arr);

    for(int i = 0; i < temp.length; i++){
      System.out.print(temp[i] + " ");
    }

  }

}
