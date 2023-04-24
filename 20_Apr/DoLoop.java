import java.util.Scanner;
public class DoLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        do{
         System.out.println("enter num ");
         num=sc.nextInt();
        }while(num>1 || num<10); // will run in infinite loop w/o any error
        System.out.println("entered num "+ num);
    }
}
