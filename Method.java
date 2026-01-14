//  @SuppressWarnings("ConvertToTryWithResources")
//  public static void visite( ) {
//     Scanner Sc = new Scanner(System.in);
//     int a = Sc.nextInt();
//     int b = Sc.nextInt();
//     int  sum = a+b;
//     System.out.println("Calculate sum =" + sum);
//     Sc.close();
//  }   
//    public static void main(String[] args) {
//        visite();
      
//    }
    
//}

class Method {
    public static int Home(int locker[], int key) {
       for (int i = 0; i < locker.length; i++) {
          if (locker[i] == key) {
            return i;
           }
       }
      return -1;
    }

   public static void main(String[] args) {
       int locker[]= { 2, 3, 8, 9, 12, 15, 24, 35,};
        int key = 2;

     int found = Home( locker, key);
      
     if (found == -1) {
       System.out.println("key is not  found");
     } else {
       System.out.println("found that  ="+ found);
     }
   }}