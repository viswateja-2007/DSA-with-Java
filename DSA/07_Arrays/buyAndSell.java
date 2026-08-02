public class buyAndSell{
  public static int buyAndSell(int arr[]){

    int buy = Integer.MAX_VALUE;
    int profitMax = Integer.MIN_VALUE;
    int profit = 0;

    for(int i = 0; i < arr.length; i++){

      int sell = arr[i];
      buy = Math.min(buy, sell);
      if(buy < sell){
        profit = sell - buy;
      }

      profitMax = Math.max(profit, profitMax);

    }

    return profitMax;

  }

  public static void main(String args[]){
    int prices[] = {7,2,5,3,6,1};
    int a1 = buyAndSell(prices);
    System.out.println(a1);





  }

}
