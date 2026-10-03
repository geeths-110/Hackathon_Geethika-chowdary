import java.util.*;
class HouseHold{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int family_members=sc.nextInt();
        double water_consumed=sc.nextDouble();
        int house_number=sc.nextInt();
        char water_usage=sc.next().charAt(0);
        System.out.println("Family Members="+family_members + "/n" +" Water Consumed="+water_consumed + "/n" + "House Number=" + house_number +"/n" + "Water Usage="+water_usage);
    }
}