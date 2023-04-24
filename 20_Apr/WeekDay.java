enum Week{
    Monday,Tuesday,Wednesday,Thrusday,friday,saturday
}
public class WeekDay {
    public static void main(String[] args) {
        for(Week w: Week.values()){
            System.out.println(w);
        }
    }
}
