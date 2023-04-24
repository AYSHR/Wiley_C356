public class Calprize {
    public static double cal(int p1,int p2,int p3){
       double d=0, act=0;
       int sum=0;
       sum+=(p1+p2+p3);
       if(sum>10000){
        d=sum*0.1;
        act=sum-d;
        return act;
       }
       else{
        return sum;
       }
       
    }
    public static void main(String[] args) {
     int p1=4000, p2=2456,p3=7890;
     System.out.println(cal(p1,p2,p3));
    }
}
