public class Demo{
 public static void main(String[] args) {
   if (args.length==0){
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
    System.out.println();
  }
  public static void printLoop(){
    for(int i=1; i<=5; i++){
      for (int j= 6-i; j>0; j--){
      System.out.print(i);
    }
      System.out.println();
    }
    System.out.println();
  }
}
