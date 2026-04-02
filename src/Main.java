import java.util.*;

public class Main {


     public static void printMyName (String name){
        System.out.println(name);
        return;
    }

    public static void pratern1 (){
        int n=5;
         for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++){
                 int number = i+j;
                 if(number%2==0){
                     System.out.print("1");
                 }else {
                     System.out.print("0");
                 }
             }
             System.out.println();
         }
         return ;
    }

    public static int printTheAvg(int a,int b, int c){
         int sum=a+b+c;
         return sum/3;
    }

    public static int printOddNumber(int n){
         if(n<=0){
             return 0;
         }
         int sum = 0;
         for(int i=1;i<=n;i+=2){
             sum+=i;
         }
         return sum;
    }

    public static int greaterOf2(int a,int b){
         if(a>b){
             return a;
         }
         return b;
    }

    public static void main(String[] args) {
        ;

        Scanner sc = new Scanner(System.in);
       // String name = sc.nextLine();


    int greater = greaterOf2(sc.nextInt(),sc.nextInt());
        System.out.println(greater);




      


//        int n = 5;
//        int m = 5;

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                if (i == 1 | j == 1 | i == n | j == m) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                int number = i + j;
//                if (number % 2 == 0) {
//                    System.out.print("1 ");
//                } else {
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//   }




    }
}
