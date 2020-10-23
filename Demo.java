public class Demo{
 public static void main(String[] args) {
   /*if (args.length==0){
     printLoop();
   }
    else printLoop(Integer.parseInt(args[0]));
  }
  public static void printLoop(int n){
    for(int i=1; i<=n; i++){
      for (int j= n-i+1; j>0; j--){
      System.out.print(i);
    }
      System.out.println();
    }
    System.out.println();*/
    int[][]ex={{3,4,5},{3,4,5}};
    System.out.println(arrayDeepToString(ex).replace("}, ","},\n "));
    System.out.println(arrayDeepToString(create2DArray(5,5,2)).replace("}, ","},\n "));
    System.out.println(arrayDeepToString(create2DArrayRandomized(6,4,4)).replace("}, ","},\n "));

  }
  //A
  public static void printLoop(){
    for(int i=1; i<=5; i++){
      for (int j= 6-i; j>0; j--){
      System.out.print(i);
    }
      System.out.println();
    }
    System.out.println();
  }
  public static String arrToString(int[]arr){
   if (arr.length==0) return "{}";
   String result=Integer.toString(arr[0]);
   for (int i=1; i<arr.length; i++){
     result = result + "," + " "+Integer.toString(arr[i]);
   }
   return "{" + result + "}";
 }
 public static String arrayDeepToString(int[][]arr){
    String result = "";
    for(int i = 0; i < arr.length; i ++){
      result += "{";
      for(int j =0; j < arr[i].length; j ++){
        result += arr[i][j];
        if(j != arr[i].length-1)
          result += ",";
      }
      if(i == arr.length-1)
        result += "}";
      else result += "}, ";
    }
    return "{" + result + "}";
  }
  //B
  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][]result= new int[rows][cols];
    for (int i=0; i<rows; i++){
      for (int j=0; j<cols; j++)
        result[i][j]=(int)(Math.random()* (maxValue+1));
    }
    return result;
  }
  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][]result = new int[rows][];
    for(int i = 0; i< rows; i ++){
      result[i] = new int[(int) (Math.random()* (cols+1))];
    }
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < result[i].length ; j++){
          result[i][j]  = (int) (Math.random()* maxValue+1);
    }
  }
  return result;
}

}
