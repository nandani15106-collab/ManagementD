import java.util.Scanner;

class Method {
  @SuppressWarnings("ConvertToTryWithResources")
  public static void visite( ) {
     Scanner Sc = new Scanner(System.in);
     int a = Sc.nextInt();
     int b = Sc.nextInt();
     int  sum = a+b;
     System.out.println("Calculate sum =" + sum);
     Sc.close();
  }   
    public static void main(String[] args) {
        visite();
      
    }
    
}