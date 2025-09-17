public class NumberStairs {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i ++){
        System.out.println(i);
        if (i != 10){
            for (int j = 1; j < i + 1; j++){
                System.out.print(j);
            }
        }
    }
  }
}
