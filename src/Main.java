import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enetr your age");
        int age = sc.nextInt();

        if(age>= 18){
            System.out.println("You are old");
        }else if (age >=16){
            System.out.println("minnor");
        }  else {
            System.out.println("wrong numer age shoud in positive number");
        }

    //System.out.println("sum = "+sum);



    }
}